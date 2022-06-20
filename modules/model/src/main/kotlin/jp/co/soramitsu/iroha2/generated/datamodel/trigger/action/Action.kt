//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.trigger.action

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.AccountId
import jp.co.soramitsu.iroha2.generated.datamodel.events.EventsFilterBox
import jp.co.soramitsu.iroha2.generated.datamodel.metadata.Metadata
import jp.co.soramitsu.iroha2.generated.datamodel.transaction.Executable
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Any

/**
 * Action
 *
 * Generated from
 * 'iroha_data_model::trigger::action::Action<iroha_data_model::events::EventsFilterBox>' regular
 * structure
 */
public data class Action<T0>(
    public val executable: Executable,
    public val repeats: Repeats,
    public val technicalAccount: AccountId,
    public val filter: EventsFilterBox,
    public val metadata: Metadata
) {
    public companion object : ScaleReader<Action<out Any>>, ScaleWriter<Action<out Any>> {
        public override fun read(reader: ScaleCodecReader): Action<out Any> = try {
            Action(
                Executable.read(reader),
                Repeats.read(reader),
                AccountId.read(reader),
                EventsFilterBox.read(reader),
                Metadata.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: Action<out Any>) = try {
            Executable.write(writer, instance.executable)
            Repeats.write(writer, instance.repeats)
            AccountId.write(writer, instance.technicalAccount)
            EventsFilterBox.write(writer, instance.filter)
            Metadata.write(writer, instance.metadata)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
