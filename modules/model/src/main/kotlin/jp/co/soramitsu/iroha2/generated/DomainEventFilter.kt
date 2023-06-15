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

/**
 * DomainEventFilter
 *
 * Generated from 'DomainEventFilter' enum
 */
public sealed class DomainEventFilter : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    public override fun equals(other: Any?) = when (this) {
        is ByCreated -> ByCreated.equals(this, other)
        is ByDeleted -> ByDeleted.equals(this, other)
        is ByMetadataInserted -> ByMetadataInserted.equals(this, other)
        is ByMetadataRemoved -> ByMetadataRemoved.equals(this, other)
        else -> super.equals(other)
    }

    public override fun hashCode() = when (this) {
        is ByCreated -> ByCreated.hashCode()
        is ByDeleted -> ByDeleted.hashCode()
        is ByMetadataInserted -> ByMetadataInserted.hashCode()
        is ByMetadataRemoved -> ByMetadataRemoved.hashCode()
        else -> super.hashCode()
    }

    /**
     * 'ByCreated' variant
     */
    public class ByCreated : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByCreated>, ScaleWriter<ByCreated> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): ByCreated = try {
                ByCreated()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByCreated) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByCreated, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = ".DomainEventFilter.ByCreated".hashCode()
        }
    }

    /**
     * 'ByDeleted' variant
     */
    public class ByDeleted : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByDeleted>, ScaleWriter<ByDeleted> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): ByDeleted = try {
                ByDeleted()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByDeleted) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByDeleted, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = ".DomainEventFilter.ByDeleted".hashCode()
        }
    }

    /**
     * 'ByMetadataInserted' variant
     */
    public class ByMetadataInserted : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByMetadataInserted>, ScaleWriter<ByMetadataInserted> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): ByMetadataInserted = try {
                ByMetadataInserted()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByMetadataInserted) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByMetadataInserted, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = ".DomainEventFilter.ByMetadataInserted".hashCode()
        }
    }

    /**
     * 'ByMetadataRemoved' variant
     */
    public class ByMetadataRemoved : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByMetadataRemoved>, ScaleWriter<ByMetadataRemoved> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): ByMetadataRemoved = try {
                ByMetadataRemoved()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByMetadataRemoved) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByMetadataRemoved, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int = ".DomainEventFilter.ByMetadataRemoved".hashCode()
        }
    }

    /**
     * 'ByAccount' variant
     */
    public data class ByAccount(
        public val filterOptOfAccountFilter: FilterOptOfAccountFilter
    ) : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByAccount>, ScaleWriter<ByAccount> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): ByAccount = try {
                ByAccount(
                    FilterOptOfAccountFilter.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByAccount) = try {
                FilterOptOfAccountFilter.write(writer, instance.filterOptOfAccountFilter)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'ByAssetDefinition' variant
     */
    public data class ByAssetDefinition(
        public val filterOptOfAssetDefinitionFilter: FilterOptOfAssetDefinitionFilter
    ) : DomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByAssetDefinition>, ScaleWriter<ByAssetDefinition> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): ByAssetDefinition = try {
                ByAssetDefinition(
                    FilterOptOfAssetDefinitionFilter.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByAssetDefinition) = try {
                FilterOptOfAssetDefinitionFilter.write(writer, instance.filterOptOfAssetDefinitionFilter)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<DomainEventFilter>, ScaleWriter<DomainEventFilter> {
        public override fun read(reader: ScaleCodecReader): DomainEventFilter = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> ByCreated.read(reader)
            1 -> ByDeleted.read(reader)
            2 -> ByMetadataInserted.read(reader)
            3 -> ByMetadataRemoved.read(reader)
            4 -> ByAccount.read(reader)
            5 -> ByAssetDefinition.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: DomainEventFilter) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> ByCreated.write(writer, instance as ByCreated)
                1 -> ByDeleted.write(writer, instance as ByDeleted)
                2 -> ByMetadataInserted.write(writer, instance as ByMetadataInserted)
                3 -> ByMetadataRemoved.write(writer, instance as ByMetadataRemoved)
                4 -> ByAccount.write(writer, instance as ByAccount)
                5 -> ByAssetDefinition.write(writer, instance as ByAssetDefinition)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}