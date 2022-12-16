//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.version.error

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import java.math.BigInteger
import kotlin.Any
import kotlin.Boolean
import kotlin.Int

/**
 * Error
 *
 * Generated from 'iroha_version::error::Error' enum
 */
public sealed class Error : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    public override fun equals(other: Any?) = when (this) {
        is NotVersioned -> NotVersioned.equals(this, other)
        is UnsupportedJsonEncode -> UnsupportedJsonEncode.equals(this, other)
        is ExpectedJson -> ExpectedJson.equals(this, other)
        is UnsupportedScaleEncode -> UnsupportedScaleEncode.equals(this, other)
        is Serde -> Serde.equals(this, other)
        is ParityScale -> ParityScale.equals(this, other)
        is ParseInt -> ParseInt.equals(this, other)
        else -> super.equals(other)
    }

    public override fun hashCode() = when (this) {
        is NotVersioned -> NotVersioned.hashCode()
        is UnsupportedJsonEncode -> UnsupportedJsonEncode.hashCode()
        is ExpectedJson -> ExpectedJson.hashCode()
        is UnsupportedScaleEncode -> UnsupportedScaleEncode.hashCode()
        is Serde -> Serde.hashCode()
        is ParityScale -> ParityScale.hashCode()
        is ParseInt -> ParseInt.hashCode()
        else -> super.hashCode()
    }

    /**
     * 'NotVersioned' variant
     */
    public class NotVersioned : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<NotVersioned>, ScaleWriter<NotVersioned> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): NotVersioned = try {
                NotVersioned()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: NotVersioned) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: NotVersioned, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.NotVersioned".hashCode()
        }
    }

    /**
     * 'UnsupportedJsonEncode' variant
     */
    public class UnsupportedJsonEncode : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<UnsupportedJsonEncode>, ScaleWriter<UnsupportedJsonEncode> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): UnsupportedJsonEncode = try {
                UnsupportedJsonEncode()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: UnsupportedJsonEncode) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: UnsupportedJsonEncode, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.UnsupportedJsonEncode".hashCode()
        }
    }

    /**
     * 'ExpectedJson' variant
     */
    public class ExpectedJson : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ExpectedJson>, ScaleWriter<ExpectedJson> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): ExpectedJson = try {
                ExpectedJson()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ExpectedJson) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ExpectedJson, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.ExpectedJson".hashCode()
        }
    }

    /**
     * 'UnsupportedScaleEncode' variant
     */
    public class UnsupportedScaleEncode : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<UnsupportedScaleEncode>,
            ScaleWriter<UnsupportedScaleEncode> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): UnsupportedScaleEncode = try {
                UnsupportedScaleEncode()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: UnsupportedScaleEncode) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: UnsupportedScaleEncode, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.UnsupportedScaleEncode".hashCode()
        }
    }

    /**
     * 'Serde' variant
     */
    public class Serde : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Serde>, ScaleWriter<Serde> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): Serde = try {
                Serde()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Serde) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: Serde, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.Serde".hashCode()
        }
    }

    /**
     * 'ParityScale' variant
     */
    public class ParityScale : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ParityScale>, ScaleWriter<ParityScale> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): ParityScale = try {
                ParityScale()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ParityScale) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ParityScale, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.ParityScale".hashCode()
        }
    }

    /**
     * 'ParseInt' variant
     */
    public class ParseInt : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ParseInt>, ScaleWriter<ParseInt> {
            public const val DISCRIMINANT: Int = 6

            public override fun read(reader: ScaleCodecReader): ParseInt = try {
                ParseInt()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ParseInt) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ParseInt, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = "version.error.Error.ParseInt".hashCode()
        }
    }

    /**
     * 'UnsupportedVersion' variant
     */
    public data class UnsupportedVersion(
        public val unsupportedVersion: jp.co.soramitsu.iroha2.generated.version.UnsupportedVersion
    ) : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<UnsupportedVersion>, ScaleWriter<UnsupportedVersion> {
            public const val DISCRIMINANT: Int = 7

            public override fun read(reader: ScaleCodecReader): UnsupportedVersion = try {
                UnsupportedVersion(
                    jp.co.soramitsu.iroha2.generated.version.UnsupportedVersion.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: UnsupportedVersion) = try {
                jp.co.soramitsu.iroha2.generated.version.UnsupportedVersion.write(
                    writer,
                    instance.unsupportedVersion
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'ExtraBytesLeft' variant
     */
    public data class ExtraBytesLeft(
        public val u64: BigInteger
    ) : Error() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ExtraBytesLeft>, ScaleWriter<ExtraBytesLeft> {
            public const val DISCRIMINANT: Int = 8

            public override fun read(reader: ScaleCodecReader): ExtraBytesLeft = try {
                ExtraBytesLeft(
                    reader.readUint64(),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ExtraBytesLeft) = try {
                writer.writeUint64(instance.u64)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<Error>, ScaleWriter<Error> {
        public override fun read(reader: ScaleCodecReader): Error = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> NotVersioned.read(reader)
            1 -> UnsupportedJsonEncode.read(reader)
            2 -> ExpectedJson.read(reader)
            3 -> UnsupportedScaleEncode.read(reader)
            4 -> Serde.read(reader)
            5 -> ParityScale.read(reader)
            6 -> ParseInt.read(reader)
            7 -> UnsupportedVersion.read(reader)
            8 -> ExtraBytesLeft.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: Error) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> NotVersioned.write(writer, instance as NotVersioned)
                1 -> UnsupportedJsonEncode.write(writer, instance as UnsupportedJsonEncode)
                2 -> ExpectedJson.write(writer, instance as ExpectedJson)
                3 -> UnsupportedScaleEncode.write(writer, instance as UnsupportedScaleEncode)
                4 -> Serde.write(writer, instance as Serde)
                5 -> ParityScale.write(writer, instance as ParityScale)
                6 -> ParseInt.write(writer, instance as ParseInt)
                7 -> UnsupportedVersion.write(writer, instance as UnsupportedVersion)
                8 -> ExtraBytesLeft.write(writer, instance as ExtraBytesLeft)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
