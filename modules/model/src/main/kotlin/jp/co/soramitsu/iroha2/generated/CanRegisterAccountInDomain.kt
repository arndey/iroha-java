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
 * CanRegisterAccountInDomain
 *
 * Generated from 'CanRegisterAccountInDomain' regular structure
 */
public data class CanRegisterAccountInDomain(
    public val domain: DomainId,
) {
    public companion object :
        ScaleReader<CanRegisterAccountInDomain>,
        ScaleWriter<CanRegisterAccountInDomain> {
        override fun read(reader: ScaleCodecReader): CanRegisterAccountInDomain = try {
            CanRegisterAccountInDomain(
                DomainId.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: CanRegisterAccountInDomain): Unit = try {
            DomainId.write(writer, instance.domain)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}