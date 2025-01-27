package com.hms.algorithm.daily.leetcode;

import java.util.Arrays;

/**
 * @Author Hms
 * @Date 2024/10/12 19:22
 **/
public class Test {


    private static void dfs(int[] arr,int idx){
        if(idx == arr.length -1){
            String string = Arrays.toString(arr);
            System.out.println(string);
        }
        if(idx == arr.length){
            return;
        }
        for(int i = idx; i< arr.length;i++){
            swap(arr,i,idx);
            dfs(arr,idx+1);
            swap(arr,idx,i);
        }
    }
    private static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        dfs(arr,0);
    }
}
