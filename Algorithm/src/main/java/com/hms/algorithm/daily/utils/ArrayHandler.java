package com.hms.algorithm.daily.utils;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @ClassName ArrayHandler
 * @Author hms
 * @Date 2024/2/20 21:44
 * @Description TODO
 */
public class ArrayHandler {

    /**
     * 数组格式字符串转 String 数组
     *
     * @param source
     * @return
     */
    public static String[] toStringArray(String source) {
        return source.substring(1,source.length()-1).split(",");
    }

    /**
     * 数组格式字符串转 int 数组
     *
     * @param source
     * @return
     */
    public static int[] toIntArray(String source) {
        return Arrays.stream(toStringArray(source)).mapToInt(Integer::parseInt).toArray();
    }

    public static int[][] toTwoDimensionIntArray(String source) {
       return JSON.parseObject(source, int[][].class);
    }

    /**
     * 数组格式字符串转 long 数组
     *
     * @param source
     * @return
     */
    public static long[] toLongArray(String source) {
        return Arrays.stream(toStringArray(source)).mapToLong(Long::parseLong).toArray();
    }

    /**
     * 数组格式字符串转 double 数组
     *
     * @param source
     * @return
     */
    public static double[] toDoubleArray(String source) {
        return Arrays.stream(toStringArray(source)).mapToDouble(Double::parseDouble).toArray();
    }

    /**
     * 数组格式字符串转 Integer 数组
     *
     * @param source
     * @return
     */
    public static Integer[] toIntegerArray(String source) {
        String[] strings = toStringArray(source);
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }

}
