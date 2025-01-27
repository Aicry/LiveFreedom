package com.hms.netty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @Author Hms
 * @Date 2024/09/05 23:21
 **/
public class ChannelTransferTo {
    public static void main(String[] args) {
        try (FileChannel from = new FileInputStream("D:\\ProjectFiles\\Freedom\\Basic\\data.txt").getChannel();
             FileChannel to = new FileOutputStream("D:\\ProjectFiles\\Freedom\\Basic\\data.txt").getChannel()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
