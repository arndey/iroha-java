//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query.domain

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.domain.DomainId
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import jp.co.soramitsu.iroha2.generated.datamodel.name.Name
import jp.co.soramitsu.iroha2.wrapException

/**
 * FindDomainKeyValueByIdAndKey
 *
 * Generated from 'iroha_data_model::query::domain::FindDomainKeyValueByIdAndKey' regular structure
 */
public data class FindDomainKeyValueByIdAndKey(
    public val id: EvaluatesTo<DomainId>,
    public val key: EvaluatesTo<Name>
) {
    public companion object :
        ScaleReader<FindDomainKeyValueByIdAndKey>,
        ScaleWriter<FindDomainKeyValueByIdAndKey> {
        public override fun read(reader: ScaleCodecReader): FindDomainKeyValueByIdAndKey = try {
            FindDomainKeyValueByIdAndKey(
                EvaluatesTo.read(reader) as EvaluatesTo<DomainId>,
                EvaluatesTo.read(reader) as EvaluatesTo<Name>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: FindDomainKeyValueByIdAndKey) =
            try {
                EvaluatesTo.write(writer, instance.id)
                EvaluatesTo.write(writer, instance.key)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
    }
}
