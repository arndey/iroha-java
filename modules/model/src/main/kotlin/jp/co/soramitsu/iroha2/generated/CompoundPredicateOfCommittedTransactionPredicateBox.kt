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
import kotlin.collections.List

/**
 * CompoundPredicateOfCommittedTransactionPredicateBox
 *
 * Generated from 'CompoundPredicateOfCommittedTransactionPredicateBox' enum
 */
public sealed class CompoundPredicateOfCommittedTransactionPredicateBox : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Atom' variant
     */
    public data class Atom(
        public val committedTransactionPredicateBox: CommittedTransactionPredicateBox,
    ) : CompoundPredicateOfCommittedTransactionPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Atom>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Atom> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Atom = try {
                Atom(
                    CommittedTransactionPredicateBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Atom,
            ): Unit = try {
                CommittedTransactionPredicateBox.write(writer, instance.committedTransactionPredicateBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Not' variant
     */
    public data class Not(
        public val compoundPredicateOfCommittedTransactionPredicateBox:
        CompoundPredicateOfCommittedTransactionPredicateBox,
    ) : CompoundPredicateOfCommittedTransactionPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Not>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Not> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Not =
                try {
                    Not(
                        CompoundPredicateOfCommittedTransactionPredicateBox.read(reader),
                    )
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Not,
            ): Unit = try {
                CompoundPredicateOfCommittedTransactionPredicateBox.write(
                    writer,
                    instance.compoundPredicateOfCommittedTransactionPredicateBox,
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'And' variant
     */
    public data class And(
        public val vec: List<CompoundPredicateOfCommittedTransactionPredicateBox>,
    ) : CompoundPredicateOfCommittedTransactionPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.And>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.And> {
            public const val DISCRIMINANT: Int = 2

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.And =
                try {
                    And(
                        reader.readVec(reader.readCompactInt()) { CompoundPredicateOfCommittedTransactionPredicateBox.read(reader) },
                    )
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.And,
            ): Unit = try {
                writer.writeCompact(instance.vec.size)
                instance.vec.forEach { value ->
                    CompoundPredicateOfCommittedTransactionPredicateBox.write(writer, value)
                }
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Or' variant
     */
    public data class Or(
        public val vec: List<CompoundPredicateOfCommittedTransactionPredicateBox>,
    ) : CompoundPredicateOfCommittedTransactionPredicateBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Or>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Or> {
            public const val DISCRIMINANT: Int = 3

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Or =
                try {
                    Or(
                        reader.readVec(reader.readCompactInt()) { CompoundPredicateOfCommittedTransactionPredicateBox.read(reader) },
                    )
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.CompoundPredicateOfCommittedTransactionPredicateBox.Or,
            ): Unit = try {
                writer.writeCompact(instance.vec.size)
                instance.vec.forEach { value ->
                    CompoundPredicateOfCommittedTransactionPredicateBox.write(writer, value)
                }
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object :
        ScaleReader<CompoundPredicateOfCommittedTransactionPredicateBox>,
        ScaleWriter<CompoundPredicateOfCommittedTransactionPredicateBox> {
        override fun read(reader: ScaleCodecReader): CompoundPredicateOfCommittedTransactionPredicateBox = when (val discriminant = reader.readUByte()) {
            0 -> Atom.read(reader)
            1 -> Not.read(reader)
            2 -> And.read(reader)
            3 -> Or.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(
            writer: ScaleCodecWriter,
            instance: CompoundPredicateOfCommittedTransactionPredicateBox,
        ) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Atom.write(writer, instance as Atom)
                1 -> Not.write(writer, instance as Not)
                2 -> And.write(writer, instance as And)
                3 -> Or.write(writer, instance as Or)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}