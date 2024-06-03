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
 * TimeInterval
 *
 * Generated from 'TimeInterval' regular structure
 */
public data class TimeInterval(
    public val since: Duration,
    public val length: Duration,
) {
    public companion object : ScaleReader<TimeInterval>, ScaleWriter<TimeInterval> {
        override fun read(reader: ScaleCodecReader): TimeInterval = try {
            TimeInterval(
                Duration.read(reader),
                Duration.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: TimeInterval): Unit = try {
            Duration.write(writer, instance.since)
            Duration.write(writer, instance.length)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
