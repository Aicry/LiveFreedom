package com.hms.netty;

import java.nio.ByteBuffer;

import static com.hms.netty.ByteBufferUtil.debugAll;


/**
 * @Author Hms
 * @Date 2024/12/13 12:20
 **/
public class TestByteBufferReadWrite {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x61);
        debugAll(buffer);
        buffer.put(new byte[]{0x62,0x63,0x64,0x65});
        debugAll(buffer);
        System.out.println(buffer.get());
        buffer.flip();
        System.out.println(buffer.get());
        buffer.compact();
        debugAll(buffer);
        buffer.put(new byte[]{0x66,0x67});
        debugAll(buffer);
    }
}
