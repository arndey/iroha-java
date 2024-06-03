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
 * BinaryOpIncompatibleNumericValueTypesError
 *
 * Generated from 'BinaryOpIncompatibleNumericValueTypesError' regular structure
 */
public data class BinaryOpIncompatibleNumericValueTypesError(
    public val left: NumericValue,
    public val right: NumericValue,
) {
    public companion object :
        ScaleReader<BinaryOpIncompatibleNumericValueTypesError>,
        ScaleWriter<BinaryOpIncompatibleNumericValueTypesError> {
        override fun read(reader: ScaleCodecReader): BinaryOpIncompatibleNumericValueTypesError = try {
            BinaryOpIncompatibleNumericValueTypesError(
                NumericValue.read(reader),
                NumericValue.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(
            writer: ScaleCodecWriter,
            instance: BinaryOpIncompatibleNumericValueTypesError,
        ): Unit = try {
            NumericValue.write(writer, instance.left)
            NumericValue.write(writer, instance.right)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
