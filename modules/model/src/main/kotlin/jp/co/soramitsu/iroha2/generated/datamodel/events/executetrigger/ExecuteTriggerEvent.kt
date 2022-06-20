//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events.executetrigger

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.AccountId
import jp.co.soramitsu.iroha2.generated.datamodel.trigger.TriggerId
import jp.co.soramitsu.iroha2.wrapException

/**
 * ExecuteTriggerEvent
 *
 * Generated from 'iroha_data_model::events::execute_trigger::ExecuteTriggerEvent' regular structure
 */
public data class ExecuteTriggerEvent(
    public val triggerId: TriggerId,
    public val authority: AccountId
) {
    public companion object : ScaleReader<ExecuteTriggerEvent>, ScaleWriter<ExecuteTriggerEvent> {
        public override fun read(reader: ScaleCodecReader): ExecuteTriggerEvent = try {
            ExecuteTriggerEvent(
                TriggerId.read(reader),
                AccountId.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: ExecuteTriggerEvent) = try {
            TriggerId.write(writer, instance.triggerId)
            AccountId.write(writer, instance.authority)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
