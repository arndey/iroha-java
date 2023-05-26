//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException

/**
 * ValidTransaction
 *
 * Generated from 'ValidTransaction' regular structure
 */
public data class ValidTransaction(
    public val payload: TransactionPayload,
    public val signatures: SignaturesOfOfTransactionPayload
) {
    public companion object : ScaleReader<ValidTransaction>, ScaleWriter<ValidTransaction> {
        public override fun read(reader: ScaleCodecReader): ValidTransaction = try {
            ValidTransaction(
                TransactionPayload.read(reader),
                SignaturesOfOfTransactionPayload.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: ValidTransaction) = try {
            TransactionPayload.write(writer, instance.payload)
            SignaturesOfOfTransactionPayload.write(writer, instance.signatures)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
