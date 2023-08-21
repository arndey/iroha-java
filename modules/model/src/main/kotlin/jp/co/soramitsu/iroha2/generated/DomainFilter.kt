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
 * DomainFilter
 *
 * Generated from 'DomainFilter' regular structure
 */
public data class DomainFilter(
    public val originFilter: FilterOptOfOriginFilterOfDomainEvent,
    public val eventFilter: FilterOptOfDomainEventFilter,
) {
    public companion object : ScaleReader<DomainFilter>, ScaleWriter<DomainFilter> {
        override fun read(reader: ScaleCodecReader): DomainFilter = try {
            DomainFilter(
                FilterOptOfOriginFilterOfDomainEvent.read(reader),
                FilterOptOfDomainEventFilter.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: DomainFilter): Unit = try {
            FilterOptOfOriginFilterOfDomainEvent.write(writer, instance.originFilter)
            FilterOptOfDomainEventFilter.write(writer, instance.eventFilter)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
