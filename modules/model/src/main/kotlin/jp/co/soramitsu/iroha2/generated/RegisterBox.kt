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
 * RegisterBox
 *
 * Generated from 'RegisterBox' regular structure
 */
public data class RegisterBox(
    public val `object`: EvaluatesTo<RegistrableBox>,
) {
    public companion object : ScaleReader<RegisterBox>, ScaleWriter<RegisterBox> {
        override fun read(reader: ScaleCodecReader): RegisterBox = try {
            RegisterBox(
                EvaluatesTo.read(reader) as EvaluatesTo<RegistrableBox>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: RegisterBox): Unit = try {
            EvaluatesTo.write(writer, instance.`object`)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
