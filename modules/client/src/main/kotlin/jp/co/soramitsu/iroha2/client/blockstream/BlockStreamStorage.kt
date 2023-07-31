package jp.co.soramitsu.iroha2.client.blockstream

import jp.co.soramitsu.iroha2.generated.VersionedBlockMessage
import kotlinx.coroutines.channels.Channel
import java.util.UUID

data class BlockStreamStorage(
    val onBlock: (block: VersionedBlockMessage) -> Any,
    val closeIf: (suspend (block: VersionedBlockMessage) -> Boolean)? = null,
    val onFailure: suspend (t: Throwable) -> Unit,
) {
    lateinit var channel: Channel<Any>

    private val id: UUID = UUID.randomUUID()

    fun getId() = id
}
