package com.hms.algorithm.daily.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LC_20240122
 * @Author hms
 * @Date 2024/1/22 21:31
 * @Description TODO
 */
public class LC_20240122 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(20));
    }

    public static int maximumSwap(int num) {
        int[] array = new int[8];
        Arrays.fill(array, Integer.MAX_VALUE);
        int len = 0;
        while (num != 0) {
            array[len] = num % 10;
            num /= 10;
            len++;
        }
        for (int i = 0; i < len / 2; i++) {
            swap(i, len - i -1, array);
        }
        int res = Integer.MIN_VALUE;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    swap(i, j, array);
                    int calculate = calculate(array);
                    res = Math.max(calculate, res);
                    swap(i, j, array);
                }
            }
        }
        return Math.max(res,calculate(array));
    }
    public static void swap(int l,int r,int[] arr) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
    public static int calculate(int[] arr) {
        int res = 0;
        for (int integer : arr) {
            if(integer<Integer.MAX_VALUE)
            res = integer + 10 * res;
        }
        return res;
    }
}


/*
* class Solution {
    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        int maxNum = num;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(charArray, i, j);
                maxNum = Math.max(maxNum, Integer.parseInt(new String(charArray)));
                swap(charArray, i, j);
            }
        }
        return maxNum;
    }

    public void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
*/