//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import java.math.BigInteger
import kotlin.Unit

/**
 * BlockEventFilter
 *
 * Generated from 'BlockEventFilter' regular structure
 */
public data class BlockEventFilter(
    public val height: BigInteger? = null,
    public val status: BlockStatus? = null,
) {
    public companion object : ScaleReader<BlockEventFilter>, ScaleWriter<BlockEventFilter> {
        override fun read(reader: ScaleCodecReader): BlockEventFilter = try {
            BlockEventFilter(
                reader.readNullable(),
                reader.readNullable(BlockStatus) as BlockStatus?,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: BlockEventFilter): Unit = try {
            writer.writeNullable(instance.height)
            writer.writeNullable(BlockStatus, instance.status)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}