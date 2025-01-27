package com.hms.netty;

import java.nio.ByteBuffer;

import static com.hms.netty.ByteBufferUtil.debugAll;

/**
 * @Author Hms
 * @Date 2024/12/13 20:29
 **/
public class TestByteBufferRead {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a', 'b', 'c', 'd', 'e', 'f'});
        buffer.flip();

        buffer.get(new byte[6]);
        debugAll(buffer);
        buffer.rewind();
        System.out.println((char)buffer.get());

        buffer.mark();
        buffer.reset();
    }
}
