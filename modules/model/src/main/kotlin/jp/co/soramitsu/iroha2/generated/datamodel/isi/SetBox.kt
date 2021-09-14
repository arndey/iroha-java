//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.isi

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.Value
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import jp.co.soramitsu.iroha2.wrapException

/**
 * SetBox
 *
 * Generated from 'iroha_data_model::isi::SetBox' regular structure
 */
public data class SetBox(
    public val `object`: EvaluatesTo<Value>
) {
    public companion object : ScaleReader<SetBox>, ScaleWriter<SetBox> {
        public override fun read(reader: ScaleCodecReader): SetBox = try {
            SetBox(
                EvaluatesTo.read(reader) as EvaluatesTo<Value>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: SetBox) = try {
            EvaluatesTo.write(writer, instance.`object`)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}