//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * MetadataChangedOfDomainId
 *
 * Generated from 'MetadataChangedOfDomainId' regular structure
 */
public data class MetadataChangedOfDomainId(
    public val targetId: DomainId,
    public val key: Name,
    public val `value`: Value,
) {
    public companion object :
        ScaleReader<MetadataChangedOfDomainId>,
        ScaleWriter<MetadataChangedOfDomainId> {
        override fun read(reader: ScaleCodecReader): MetadataChangedOfDomainId = try {
            MetadataChangedOfDomainId(
                DomainId.read(reader),
                Name.read(reader),
                Value.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: MetadataChangedOfDomainId): Unit = try {
            DomainId.write(writer, instance.targetId)
            Name.write(writer, instance.key)
            Value.write(writer, instance.`value`)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
