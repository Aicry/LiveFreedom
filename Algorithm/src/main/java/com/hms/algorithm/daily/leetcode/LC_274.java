package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.Arrays;

/**
 * @ClassName LC_274
 * @Author hms
 * @Date 2024/3/3 15:09
 * @Description TODO
 */
public class LC_274 {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length;
        int res = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] >= size-i){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int i = hIndex(ArrayHandler.toIntArray("[1,3,1]"));
        System.out.println(i);
    }
}
