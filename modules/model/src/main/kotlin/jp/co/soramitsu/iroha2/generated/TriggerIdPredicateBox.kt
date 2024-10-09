//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int
import kotlin.Unit

/**
 * TriggerIdPredicateBox
 *
 * Generated from 'TriggerIdPredicateBox' enum
 */
public sealed class TriggerIdPredicateBox : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Equals' variant
     */
    public data class Equals(
        public val triggerId: TriggerId,
    ) : TriggerIdPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Equals>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Equals> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Equals = try {
                Equals(
                    TriggerId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Equals,
            ): Unit = try {
                TriggerId.write(writer, instance.triggerId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Name' variant
     */
    public data class Name(
        public val stringPredicateBox: StringPredicateBox,
    ) : TriggerIdPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Name>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Name> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Name = try {
                Name(
                    StringPredicateBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TriggerIdPredicateBox.Name,
            ): Unit = try {
                StringPredicateBox.write(writer, instance.stringPredicateBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<TriggerIdPredicateBox>, ScaleWriter<TriggerIdPredicateBox> {
        override fun read(reader: ScaleCodecReader): TriggerIdPredicateBox = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Equals.read(reader)
            1 -> Name.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: TriggerIdPredicateBox) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Equals.write(writer, instance as Equals)
                1 -> Name.write(writer, instance as Name)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}