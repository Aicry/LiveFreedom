package com.hms.netty;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static com.hms.netty.ByteBufferUtil.debugAll;

/**
 * @Author Hms
 * @Date 2024/12/13 20:45
 **/
public class TestByteBufferString {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(16);
        buffer.put("Hello World".getBytes());
        debugAll(buffer);

        ByteBuffer buffer1 = StandardCharsets.UTF_8.encode("Hello World");
        debugAll(buffer1);

        ByteBuffer buffer2 = ByteBuffer.wrap("Hello World".getBytes());
        debugAll(buffer2);

        String str = StandardCharsets.UTF_8.decode(buffer1).toString();
        System.out.println(str);

        String str1 = StandardCharsets.UTF_8.decode(buffer2).toString();
        System.out.println(str1);
    }
}
