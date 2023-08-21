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
 * NewParameterBox
 *
 * Generated from 'NewParameterBox' regular structure
 */
public data class NewParameterBox(
    public val parameter: EvaluatesTo<Parameter>,
) {
    public companion object : ScaleReader<NewParameterBox>, ScaleWriter<NewParameterBox> {
        override fun read(reader: ScaleCodecReader): NewParameterBox = try {
            NewParameterBox(
                EvaluatesTo.read(reader) as EvaluatesTo<Parameter>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: NewParameterBox): Unit = try {
            EvaluatesTo.write(writer, instance.parameter)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
