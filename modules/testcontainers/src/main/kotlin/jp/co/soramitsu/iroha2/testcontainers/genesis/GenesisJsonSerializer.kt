package jp.co.soramitsu.iroha2.testcontainers.genesis

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import io.ipfs.multihash.Multihash
import jp.co.soramitsu.iroha2.DigestFunction.Ed25519
import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.generated.crypto.PublicKey
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import jp.co.soramitsu.iroha2.generated.datamodel.metadata.Metadata
import jp.co.soramitsu.iroha2.toHex
import java.io.ByteArrayOutputStream
import java.lang.reflect.Type
import kotlin.reflect.full.memberProperties
import kotlin.reflect.javaType

object GenesisJsonSerializer {

    private val gson = lazy {
        GsonBuilder()
            .setPrettyPrinting()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeHierarchyAdapter(ModelEnum::class.java, EnumerationSerializer)
            .registerTypeAdapter(EvaluatesTo::class.java, EvaluatesToSerializer)
            .registerTypeAdapter(Metadata::class.java, MetadataSerializer)
            .registerTypeAdapter(PublicKey::class.java, PublicKeySerializer)
            .registerTypeAdapter(UInt::class.java, UIntSerializer)
            .create()
    }

    fun asJson(genesis: Genesis): String {
        return gson.value.toJson(genesis.genesisBlock)
    }
}

object EnumerationSerializer : JsonSerializer<Any> {
    @OptIn(ExperimentalStdlibApi::class)
    override fun serialize(src: Any, typeOfSrc: Type?, context: JsonSerializationContext): JsonElement {
        val serialized = JsonObject()

        val memberProperties = src::class.memberProperties
        if (memberProperties.isEmpty()) {
            return JsonPrimitive(src::class.java.simpleName)
        } else if (memberProperties.size != 1) {
            throw RuntimeException("Expected enum which accept exactly 1 member as tuple")
        }
        val innerProp = memberProperties.first()
        val innerPropVal = when (val actual = innerProp.call(src)) {
            is UInt -> actual.toLong() // cannot cast UInt to Number
            else -> actual
        }
        serialized.add(src::class.simpleName, context.serialize(innerPropVal, innerProp.returnType.javaType))
        return serialized
    }
}

object EvaluatesToSerializer : JsonSerializer<EvaluatesTo<*>> {
    override fun serialize(src: EvaluatesTo<*>, typeOfSrc: Type, context: JsonSerializationContext): JsonElement =
        EnumerationSerializer.serialize(src.expression, null, context)
}

object MetadataSerializer : JsonSerializer<Metadata> {
    override fun serialize(src: Metadata, typeOfSrc: Type?, context: JsonSerializationContext): JsonElement {
        val jsonObject = JsonObject()
        src.map.forEach { (key, value) ->
            jsonObject.add(key, EnumerationSerializer.serialize(value, null, context))
        }
        return jsonObject
    }
}

object PublicKeySerializer : JsonSerializer<PublicKey> {
    override fun serialize(src: PublicKey, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val res = ByteArrayOutputStream()
        Multihash.putUvarint(res, Ed25519.index.toLong())
        Multihash.putUvarint(res, src.payload.size.toLong())
        res.write(src.payload)
        return context.serialize(res.toByteArray().toHex())
    }
}

object UIntSerializer : JsonSerializer<UInt> {
    override fun serialize(src: UInt, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        return context.serialize(src.toLong())
    }
}