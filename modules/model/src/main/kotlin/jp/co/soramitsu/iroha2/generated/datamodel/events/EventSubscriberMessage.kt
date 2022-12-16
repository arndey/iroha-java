//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Any
import kotlin.Boolean
import kotlin.Int

/**
 * EventSubscriberMessage
 *
 * Generated from 'iroha_data_model::events::EventSubscriberMessage' enum
 */
public sealed class EventSubscriberMessage : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    public override fun equals(other: Any?) = when (this) {
        is EventReceived -> EventReceived.equals(this, other)
        else -> super.equals(other)
    }

    public override fun hashCode() = when (this) {
        is EventReceived -> EventReceived.hashCode()
        else -> super.hashCode()
    }

    /**
     * 'SubscriptionRequest' variant
     */
    public data class SubscriptionRequest(
        public val eventsFilterBox: EventsFilterBox
    ) : EventSubscriberMessage() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<SubscriptionRequest>, ScaleWriter<SubscriptionRequest> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): SubscriptionRequest = try {
                SubscriptionRequest(
                    EventsFilterBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: SubscriptionRequest) = try {
                EventsFilterBox.write(writer, instance.eventsFilterBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'EventReceived' variant
     */
    public class EventReceived : EventSubscriberMessage() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<EventReceived>, ScaleWriter<EventReceived> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): EventReceived = try {
                EventReceived()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: EventReceived) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: EventReceived, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.EventSubscriberMessage.EventReceived".hashCode()
        }
    }

    public companion object : ScaleReader<EventSubscriberMessage>, ScaleWriter<EventSubscriberMessage> {
        public override fun read(reader: ScaleCodecReader): EventSubscriberMessage = when (
            val
            discriminant = reader.readUByte()
        ) {
            0 -> SubscriptionRequest.read(reader)
            1 -> EventReceived.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: EventSubscriberMessage) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> SubscriptionRequest.write(writer, instance as SubscriptionRequest)
                1 -> EventReceived.write(writer, instance as EventReceived)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
