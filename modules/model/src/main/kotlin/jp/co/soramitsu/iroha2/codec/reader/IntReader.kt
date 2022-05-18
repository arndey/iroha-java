package jp.co.soramitsu.iroha2.codec.reader

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleReader
import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder

/**
 * Read Java Integer encoded as 4 byte SCALE value. Please note that since Java Integer is signed type, it may
 * read negative values for some byte representations (i.e. when highest bit is set to 1). If you expect
 * to read positive numbers for all the possible range, you should use Uint32Reader, which returns Long values.
 *
 * @see UInt32Reader
 */
class Int32Reader : ScaleReader<Int> {
    override fun read(reader: ScaleCodecReader): Int {
        val capacity = 4
        val buf = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN)
        putBytes(buf, capacity, reader)
        return (buf.flip() as ByteBuffer).int
    }
}

class Int64Reader : ScaleReader<Long> {
    override fun read(reader: ScaleCodecReader): Long {
        val capacity = 8
        val buf = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN)
        putBytes(buf, capacity, reader)
        return (buf.flip() as ByteBuffer).long
    }
}

class IntReader(private val bit: Int) : ScaleReader<BigInteger> {
    override fun read(reader: ScaleCodecReader): BigInteger {
        val capacity = bit / 8
        val buf = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN)
        putBytes(buf, capacity, reader)
        return BigInteger(buf.flip().array() as ByteArray)
    }
}

private fun putBytes(buf: ByteBuffer, capacity: Int, rdr: ScaleCodecReader) {
    for (i in 1..capacity) {
        buf.put(rdr.readByte())
    }
}
