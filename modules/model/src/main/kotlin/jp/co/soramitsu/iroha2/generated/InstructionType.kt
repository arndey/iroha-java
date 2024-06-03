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
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * InstructionType
 *
 * Generated from 'InstructionType' enum
 */
public sealed class InstructionType : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    override fun equals(other: Any?): Boolean = when (this) {
        is Register -> Register.equals(this, other)
        is Unregister -> Unregister.equals(this, other)
        is Mint -> Mint.equals(this, other)
        is Burn -> Burn.equals(this, other)
        is Transfer -> Transfer.equals(this, other)
        is If -> If.equals(this, other)
        is Pair -> Pair.equals(this, other)
        is Sequence -> Sequence.equals(this, other)
        is SetKeyValue -> SetKeyValue.equals(this, other)
        is RemoveKeyValue -> RemoveKeyValue.equals(this, other)
        is Grant -> Grant.equals(this, other)
        is Revoke -> Revoke.equals(this, other)
        is ExecuteTrigger -> ExecuteTrigger.equals(this, other)
        is SetParameter -> SetParameter.equals(this, other)
        is NewParameter -> NewParameter.equals(this, other)
        is Upgrade -> Upgrade.equals(this, other)
        is Log -> Log.equals(this, other)
        is Fail -> Fail.equals(this, other)
        else -> super.equals(other) }

    override fun hashCode(): Int = when (this) {
        is Register -> Register.hashCode()
        is Unregister -> Unregister.hashCode()
        is Mint -> Mint.hashCode()
        is Burn -> Burn.hashCode()
        is Transfer -> Transfer.hashCode()
        is If -> If.hashCode()
        is Pair -> Pair.hashCode()
        is Sequence -> Sequence.hashCode()
        is SetKeyValue -> SetKeyValue.hashCode()
        is RemoveKeyValue -> RemoveKeyValue.hashCode()
        is Grant -> Grant.hashCode()
        is Revoke -> Revoke.hashCode()
        is ExecuteTrigger -> ExecuteTrigger.hashCode()
        is SetParameter -> SetParameter.hashCode()
        is NewParameter -> NewParameter.hashCode()
        is Upgrade -> Upgrade.hashCode()
        is Log -> Log.hashCode()
        is Fail -> Fail.hashCode()
        else -> super.hashCode() }

    /**
     * 'Register' variant
     */
    public class Register : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Register>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Register> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Register = try {
                Register()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Register,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Register, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Register".hashCode()
        }
    }

    /**
     * 'Unregister' variant
     */
    public class Unregister : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Unregister>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Unregister> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Unregister = try {
                Unregister()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Unregister,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Unregister, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Unregister".hashCode()
        }
    }

    /**
     * 'Mint' variant
     */
    public class Mint : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Mint>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Mint> {
            public const val DISCRIMINANT: Int = 2

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Mint = try {
                Mint()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Mint,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Mint, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Mint".hashCode()
        }
    }

    /**
     * 'Burn' variant
     */
    public class Burn : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Burn>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Burn> {
            public const val DISCRIMINANT: Int = 3

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Burn = try {
                Burn()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Burn,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Burn, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Burn".hashCode()
        }
    }

    /**
     * 'Transfer' variant
     */
    public class Transfer : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Transfer>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Transfer> {
            public const val DISCRIMINANT: Int = 4

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Transfer = try {
                Transfer()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Transfer,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Transfer, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Transfer".hashCode()
        }
    }

    /**
     * 'If' variant
     */
    public class If : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.If>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.If> {
            public const val DISCRIMINANT: Int = 5

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.If = try {
                If()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.If,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.If, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.If".hashCode()
        }
    }

    /**
     * 'Pair' variant
     */
    public class Pair : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Pair>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Pair> {
            public const val DISCRIMINANT: Int = 6

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Pair = try {
                Pair()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Pair,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Pair, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Pair".hashCode()
        }
    }

    /**
     * 'Sequence' variant
     */
    public class Sequence : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Sequence>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Sequence> {
            public const val DISCRIMINANT: Int = 7

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Sequence = try {
                Sequence()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Sequence,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Sequence, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Sequence".hashCode()
        }
    }

    /**
     * 'SetKeyValue' variant
     */
    public class SetKeyValue : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.SetKeyValue>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.SetKeyValue> {
            public const val DISCRIMINANT: Int = 8

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.SetKeyValue = try {
                SetKeyValue()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.SetKeyValue,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.SetKeyValue, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.SetKeyValue".hashCode()
        }
    }

    /**
     * 'RemoveKeyValue' variant
     */
    public class RemoveKeyValue : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.RemoveKeyValue>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.RemoveKeyValue> {
            public const val DISCRIMINANT: Int = 9

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.RemoveKeyValue = try {
                RemoveKeyValue()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.RemoveKeyValue,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.InstructionType.RemoveKeyValue,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.RemoveKeyValue".hashCode()
        }
    }

    /**
     * 'Grant' variant
     */
    public class Grant : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Grant>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Grant> {
            public const val DISCRIMINANT: Int = 10

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Grant = try {
                Grant()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Grant,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Grant, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Grant".hashCode()
        }
    }

    /**
     * 'Revoke' variant
     */
    public class Revoke : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Revoke>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Revoke> {
            public const val DISCRIMINANT: Int = 11

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Revoke = try {
                Revoke()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Revoke,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Revoke, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Revoke".hashCode()
        }
    }

    /**
     * 'ExecuteTrigger' variant
     */
    public class ExecuteTrigger : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.ExecuteTrigger>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.ExecuteTrigger> {
            public const val DISCRIMINANT: Int = 12

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.ExecuteTrigger = try {
                ExecuteTrigger()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.ExecuteTrigger,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.InstructionType.ExecuteTrigger,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.ExecuteTrigger".hashCode()
        }
    }

    /**
     * 'SetParameter' variant
     */
    public class SetParameter : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.SetParameter>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.SetParameter> {
            public const val DISCRIMINANT: Int = 13

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.SetParameter = try {
                SetParameter()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.SetParameter,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.InstructionType.SetParameter,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.SetParameter".hashCode()
        }
    }

    /**
     * 'NewParameter' variant
     */
    public class NewParameter : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.NewParameter>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.NewParameter> {
            public const val DISCRIMINANT: Int = 14

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.NewParameter = try {
                NewParameter()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.NewParameter,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.InstructionType.NewParameter,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.NewParameter".hashCode()
        }
    }

    /**
     * 'Upgrade' variant
     */
    public class Upgrade : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Upgrade>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Upgrade> {
            public const val DISCRIMINANT: Int = 15

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Upgrade = try {
                Upgrade()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Upgrade,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Upgrade, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Upgrade".hashCode()
        }
    }

    /**
     * 'Log' variant
     */
    public class Log : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Log>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Log> {
            public const val DISCRIMINANT: Int = 16

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Log = try {
                Log()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Log,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Log, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Log".hashCode()
        }
    }

    /**
     * 'Fail' variant
     */
    public class Fail : InstructionType() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionType.Fail>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionType.Fail> {
            public const val DISCRIMINANT: Int = 17

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionType.Fail = try {
                Fail()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionType.Fail,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.InstructionType.Fail, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".InstructionType.Fail".hashCode()
        }
    }

    public companion object : ScaleReader<InstructionType>, ScaleWriter<InstructionType> {
        override fun read(reader: ScaleCodecReader): InstructionType = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Register.read(reader)
            1 -> Unregister.read(reader)
            2 -> Mint.read(reader)
            3 -> Burn.read(reader)
            4 -> Transfer.read(reader)
            5 -> If.read(reader)
            6 -> Pair.read(reader)
            7 -> Sequence.read(reader)
            8 -> SetKeyValue.read(reader)
            9 -> RemoveKeyValue.read(reader)
            10 -> Grant.read(reader)
            11 -> Revoke.read(reader)
            12 -> ExecuteTrigger.read(reader)
            13 -> SetParameter.read(reader)
            14 -> NewParameter.read(reader)
            15 -> Upgrade.read(reader)
            16 -> Log.read(reader)
            17 -> Fail.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: InstructionType) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Register.write(writer, instance as Register)
                1 -> Unregister.write(writer, instance as Unregister)
                2 -> Mint.write(writer, instance as Mint)
                3 -> Burn.write(writer, instance as Burn)
                4 -> Transfer.write(writer, instance as Transfer)
                5 -> If.write(writer, instance as If)
                6 -> Pair.write(writer, instance as Pair)
                7 -> Sequence.write(writer, instance as Sequence)
                8 -> SetKeyValue.write(writer, instance as SetKeyValue)
                9 -> RemoveKeyValue.write(writer, instance as RemoveKeyValue)
                10 -> Grant.write(writer, instance as Grant)
                11 -> Revoke.write(writer, instance as Revoke)
                12 -> ExecuteTrigger.write(writer, instance as ExecuteTrigger)
                13 -> SetParameter.write(writer, instance as SetParameter)
                14 -> NewParameter.write(writer, instance as NewParameter)
                15 -> Upgrade.write(writer, instance as Upgrade)
                16 -> Log.write(writer, instance as Log)
                17 -> Fail.write(writer, instance as Fail)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}
