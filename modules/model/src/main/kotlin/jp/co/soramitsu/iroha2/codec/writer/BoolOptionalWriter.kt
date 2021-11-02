package jp.co.soramitsu.iroha2.codec.writer

import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleWriter

class BoolOptionalWriter : ScaleWriter<Boolean?> {
    override fun write(wrt: ScaleCodecWriter, value: Boolean?) {
        when (value) {
            null -> wrt.directWrite(0)
            false -> wrt.directWrite(1)
            true -> wrt.directWrite(2)
        }
    }
}