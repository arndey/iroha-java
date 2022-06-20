//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.NewAccount
import jp.co.soramitsu.iroha2.generated.datamodel.domain.NewDomain
import jp.co.soramitsu.iroha2.generated.datamodel.events.EventsFilterBox
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int

/**
 * RegistrableBox
 *
 * Generated from 'iroha_data_model::RegistrableBox' enum
 */
public sealed class RegistrableBox : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Peer' variant
     */
    public data class Peer(
        public val peer: jp.co.soramitsu.iroha2.generated.datamodel.peer.Peer
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Peer>, ScaleWriter<Peer> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): Peer = try {
                Peer(
                    jp.co.soramitsu.iroha2.generated.datamodel.peer.Peer.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Peer) = try {
                jp.co.soramitsu.iroha2.generated.datamodel.peer.Peer.write(writer, instance.peer)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Domain' variant
     */
    public data class Domain(
        public val newDomain: NewDomain
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Domain>, ScaleWriter<Domain> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): Domain = try {
                Domain(
                    NewDomain.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Domain) = try {
                NewDomain.write(writer, instance.newDomain)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Account' variant
     */
    public data class Account(
        public val newAccount: NewAccount
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Account>, ScaleWriter<Account> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): Account = try {
                Account(
                    NewAccount.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Account) = try {
                NewAccount.write(writer, instance.newAccount)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'AssetDefinition' variant
     */
    public data class AssetDefinition(
        public val assetDefinition: jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetDefinition
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<AssetDefinition>, ScaleWriter<AssetDefinition> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): AssetDefinition = try {
                AssetDefinition(
                    jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetDefinition.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: AssetDefinition) = try {
                jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetDefinition.write(
                    writer,
                    instance.assetDefinition
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Asset' variant
     */
    public data class Asset(
        public val asset: jp.co.soramitsu.iroha2.generated.datamodel.asset.Asset
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Asset>, ScaleWriter<Asset> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): Asset = try {
                Asset(
                    jp.co.soramitsu.iroha2.generated.datamodel.asset.Asset.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Asset) = try {
                jp.co.soramitsu.iroha2.generated.datamodel.asset.Asset.write(writer, instance.asset)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Trigger' variant
     */
    public data class Trigger(
        public val trigger: jp.co.soramitsu.iroha2.generated.datamodel.trigger.Trigger<EventsFilterBox>
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Trigger>, ScaleWriter<Trigger> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): Trigger = try {
                Trigger(
                    jp.co.soramitsu.iroha2.generated.datamodel.trigger.Trigger.read(reader) as
                        jp.co.soramitsu.iroha2.generated.datamodel.trigger.Trigger<EventsFilterBox>,
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Trigger) = try {
                jp.co.soramitsu.iroha2.generated.datamodel.trigger.Trigger.write(writer, instance.trigger)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Role' variant
     */
    public data class Role(
        public val role: jp.co.soramitsu.iroha2.generated.datamodel.role.Role
    ) : RegistrableBox() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Role>, ScaleWriter<Role> {
            public const val DISCRIMINANT: Int = 6

            public override fun read(reader: ScaleCodecReader): Role = try {
                Role(
                    jp.co.soramitsu.iroha2.generated.datamodel.role.Role.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Role) = try {
                jp.co.soramitsu.iroha2.generated.datamodel.role.Role.write(writer, instance.role)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<RegistrableBox>, ScaleWriter<RegistrableBox> {
        public override fun read(reader: ScaleCodecReader): RegistrableBox = when (
            val discriminant =
                reader.readUByte().toInt()
        ) {
            0 -> Peer.read(reader)
            1 -> Domain.read(reader)
            2 -> Account.read(reader)
            3 -> AssetDefinition.read(reader)
            4 -> Asset.read(reader)
            5 -> Trigger.read(reader)
            6 -> Role.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: RegistrableBox) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Peer.write(writer, instance as Peer)
                1 -> Domain.write(writer, instance as Domain)
                2 -> Account.write(writer, instance as Account)
                3 -> AssetDefinition.write(writer, instance as AssetDefinition)
                4 -> Asset.write(writer, instance as Asset)
                5 -> Trigger.write(writer, instance as Trigger)
                6 -> Role.write(writer, instance as Role)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
