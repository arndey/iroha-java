//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.comparator
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit
import kotlin.collections.Map

/**
 * Where
 *
 * Generated from 'Where' regular structure
 */
public data class Where(
    public val expression: EvaluatesTo<Value>,
    public val values: Map<Name, EvaluatesTo<Value>>,
) {
    public companion object : ScaleReader<Where>, ScaleWriter<Where> {
        override fun read(reader: ScaleCodecReader): Where = try {
            Where(
                EvaluatesTo.read(reader) as EvaluatesTo<Value>,
                reader.readMap(reader.readCompactInt(), { Name.read(reader) }, {
                    EvaluatesTo.read(reader) as
                        EvaluatesTo<Value>
                }),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: Where): Unit = try {
            EvaluatesTo.write(writer, instance.expression)
            writer.writeCompact(instance.values.size)
            instance.values.toSortedMap(
                Name.comparator(),
            ).forEach { (key, value) ->
                Name.write(writer, key)
                EvaluatesTo.write(writer, value)
            }
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
