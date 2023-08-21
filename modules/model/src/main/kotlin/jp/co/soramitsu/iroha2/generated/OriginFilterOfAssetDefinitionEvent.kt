//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * OriginFilterOfAssetDefinitionEvent
 *
 * Generated from 'OriginFilterOfAssetDefinitionEvent' regular structure
 */
public data class OriginFilterOfAssetDefinitionEvent(
    public val assetDefinitionId: AssetDefinitionId,
) {
    public companion object :
        ScaleReader<OriginFilterOfAssetDefinitionEvent>,
        ScaleWriter<OriginFilterOfAssetDefinitionEvent> {
        override fun read(reader: ScaleCodecReader): OriginFilterOfAssetDefinitionEvent = try {
            OriginFilterOfAssetDefinitionEvent(
                AssetDefinitionId.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: OriginFilterOfAssetDefinitionEvent): Unit = try {
            AssetDefinitionId.write(writer, instance.assetDefinitionId)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
