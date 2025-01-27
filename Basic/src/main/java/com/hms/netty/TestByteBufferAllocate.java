package com.hms.netty;

import java.nio.ByteBuffer;

/**
 * @Author Hms
 * @Date 2024/12/13 20:17
 **/
public class TestByteBufferAllocate {
    public static void main(String[] args) {

        //java堆内存
        System.out.println(ByteBuffer.allocate(16).getClass());

        //直接内存，读写效率高（少一次拷贝）
        System.out.println(ByteBuffer.allocateDirect(16).getClass());
    }
}
