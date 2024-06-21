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
 * InstructionBox
 *
 * Generated from 'InstructionBox' enum
 */
public sealed class InstructionBox : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Register' variant
     */
    public data class Register(
        public val registerBox: RegisterBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Register>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Register> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Register = try {
                Register(
                    RegisterBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Register,
            ): Unit = try {
                RegisterBox.write(writer, instance.registerBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Unregister' variant
     */
    public data class Unregister(
        public val unregisterBox: UnregisterBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Unregister>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Unregister> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Unregister = try {
                Unregister(
                    UnregisterBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Unregister,
            ): Unit = try {
                UnregisterBox.write(writer, instance.unregisterBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Mint' variant
     */
    public data class Mint(
        public val mintBox: MintBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Mint>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Mint> {
            public const val DISCRIMINANT: Int = 2

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Mint = try {
                Mint(
                    MintBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Mint,
            ): Unit = try {
                MintBox.write(writer, instance.mintBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Burn' variant
     */
    public data class Burn(
        public val burnBox: BurnBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Burn>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Burn> {
            public const val DISCRIMINANT: Int = 3

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Burn = try {
                Burn(
                    BurnBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Burn,
            ): Unit = try {
                BurnBox.write(writer, instance.burnBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Transfer' variant
     */
    public data class Transfer(
        public val transferBox: TransferBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Transfer>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Transfer> {
            public const val DISCRIMINANT: Int = 4

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Transfer = try {
                Transfer(
                    TransferBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Transfer,
            ): Unit = try {
                TransferBox.write(writer, instance.transferBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'SetKeyValue' variant
     */
    public data class SetKeyValue(
        public val setKeyValueBox: SetKeyValueBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.SetKeyValue>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.SetKeyValue> {
            public const val DISCRIMINANT: Int = 5

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.SetKeyValue = try {
                SetKeyValue(
                    SetKeyValueBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.SetKeyValue,
            ): Unit = try {
                SetKeyValueBox.write(writer, instance.setKeyValueBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'RemoveKeyValue' variant
     */
    public data class RemoveKeyValue(
        public val removeKeyValueBox: RemoveKeyValueBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.RemoveKeyValue>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.RemoveKeyValue> {
            public const val DISCRIMINANT: Int = 6

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.RemoveKeyValue = try {
                RemoveKeyValue(
                    RemoveKeyValueBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.RemoveKeyValue,
            ): Unit = try {
                RemoveKeyValueBox.write(writer, instance.removeKeyValueBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Grant' variant
     */
    public data class Grant(
        public val grantBox: GrantBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Grant>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Grant> {
            public const val DISCRIMINANT: Int = 7

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Grant = try {
                Grant(
                    GrantBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Grant,
            ): Unit = try {
                GrantBox.write(writer, instance.grantBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Revoke' variant
     */
    public data class Revoke(
        public val revokeBox: RevokeBox,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Revoke>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Revoke> {
            public const val DISCRIMINANT: Int = 8

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Revoke = try {
                Revoke(
                    RevokeBox.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Revoke,
            ): Unit = try {
                RevokeBox.write(writer, instance.revokeBox)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'ExecuteTrigger' variant
     */
    public data class ExecuteTrigger(
        public val executeTrigger: jp.co.soramitsu.iroha2.generated.ExecuteTrigger,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.ExecuteTrigger>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.ExecuteTrigger> {
            public const val DISCRIMINANT: Int = 9

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.ExecuteTrigger = try {
                ExecuteTrigger(
                    jp.co.soramitsu.iroha2.generated.ExecuteTrigger.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.ExecuteTrigger,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.ExecuteTrigger.write(writer, instance.executeTrigger)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'SetParameter' variant
     */
    public data class SetParameter(
        public val setParameter: jp.co.soramitsu.iroha2.generated.SetParameter,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.SetParameter>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.SetParameter> {
            public const val DISCRIMINANT: Int = 10

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.SetParameter = try {
                SetParameter(
                    jp.co.soramitsu.iroha2.generated.SetParameter.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.SetParameter,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.SetParameter.write(writer, instance.setParameter)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'NewParameter' variant
     */
    public data class NewParameter(
        public val newParameter: jp.co.soramitsu.iroha2.generated.NewParameter,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.NewParameter>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.NewParameter> {
            public const val DISCRIMINANT: Int = 11

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.NewParameter = try {
                NewParameter(
                    jp.co.soramitsu.iroha2.generated.NewParameter.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.NewParameter,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.NewParameter.write(writer, instance.newParameter)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Upgrade' variant
     */
    public data class Upgrade(
        public val upgrade: jp.co.soramitsu.iroha2.generated.Upgrade,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Upgrade>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Upgrade> {
            public const val DISCRIMINANT: Int = 12

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Upgrade = try {
                Upgrade(
                    jp.co.soramitsu.iroha2.generated.Upgrade.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Upgrade,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.Upgrade.write(writer, instance.upgrade)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Log' variant
     */
    public data class Log(
        public val log: jp.co.soramitsu.iroha2.generated.Log,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Log>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Log> {
            public const val DISCRIMINANT: Int = 13

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Log = try {
                Log(
                    jp.co.soramitsu.iroha2.generated.Log.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Log,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.Log.write(writer, instance.log)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Custom' variant
     */
    public data class Custom(
        public val custom: jp.co.soramitsu.iroha2.generated.Custom,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Custom>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Custom> {
            public const val DISCRIMINANT: Int = 14

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Custom = try {
                Custom(
                    jp.co.soramitsu.iroha2.generated.Custom.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Custom,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.Custom.write(writer, instance.custom)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Fail' variant
     */
    public data class Fail(
        public val fail: jp.co.soramitsu.iroha2.generated.Fail,
    ) : InstructionBox() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.InstructionBox.Fail>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.InstructionBox.Fail> {
            public const val DISCRIMINANT: Int = 15

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.InstructionBox.Fail = try {
                Fail(
                    jp.co.soramitsu.iroha2.generated.Fail.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.InstructionBox.Fail,
            ): Unit = try {
                jp.co.soramitsu.iroha2.generated.Fail.write(writer, instance.fail)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<InstructionBox>, ScaleWriter<InstructionBox> {
        override fun read(reader: ScaleCodecReader): InstructionBox = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Register.read(reader)
            1 -> Unregister.read(reader)
            2 -> Mint.read(reader)
            3 -> Burn.read(reader)
            4 -> Transfer.read(reader)
            5 -> SetKeyValue.read(reader)
            6 -> RemoveKeyValue.read(reader)
            7 -> Grant.read(reader)
            8 -> Revoke.read(reader)
            9 -> ExecuteTrigger.read(reader)
            10 -> SetParameter.read(reader)
            11 -> NewParameter.read(reader)
            12 -> Upgrade.read(reader)
            13 -> Log.read(reader)
            14 -> Custom.read(reader)
            15 -> Fail.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: InstructionBox) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Register.write(writer, instance as Register)
                1 -> Unregister.write(writer, instance as Unregister)
                2 -> Mint.write(writer, instance as Mint)
                3 -> Burn.write(writer, instance as Burn)
                4 -> Transfer.write(writer, instance as Transfer)
                5 -> SetKeyValue.write(writer, instance as SetKeyValue)
                6 -> RemoveKeyValue.write(writer, instance as RemoveKeyValue)
                7 -> Grant.write(writer, instance as Grant)
                8 -> Revoke.write(writer, instance as Revoke)
                9 -> ExecuteTrigger.write(writer, instance as ExecuteTrigger)
                10 -> SetParameter.write(writer, instance as SetParameter)
                11 -> NewParameter.write(writer, instance as NewParameter)
                12 -> Upgrade.write(writer, instance as Upgrade)
                13 -> Log.write(writer, instance as Log)
                14 -> Custom.write(writer, instance as Custom)
                15 -> Fail.write(writer, instance as Fail)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}
