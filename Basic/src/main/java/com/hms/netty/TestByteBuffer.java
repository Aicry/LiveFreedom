package com.hms.netty;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author Hms
 * @Date 2024/09/04 23:15
 **/
@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) {
        try (FileChannel channel = new FileInputStream("D:\\ProjectFiles\\Freedom\\Basic\\data.txt").getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (true){
                int len = channel.read(buffer);
                System.out.println(len);
                log.debug("读到的字节数{}",len);
                if(len == -1)break;
            }
            buffer.flip();
            while (buffer.hasRemaining()){
                byte b = buffer.get();
                System.out.println(b);
                log.debug("实际字节{}",(char)b);
            }
            buffer.clear();
        } catch (IOException e) {
        }
    }
}
