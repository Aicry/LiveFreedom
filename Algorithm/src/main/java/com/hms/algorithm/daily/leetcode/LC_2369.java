package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LC_20240302
 * @Author hms
 * @Date 2024/3/2 12:55
 * @Description TODO
 */
public class LC_2369 {
    public static void main(String[] args) {
        System.out.println(
                validPartition(ArrayHandler.toIntArray("[1,1,1,2]")));
    }

    public static boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && validTwo(nums[i - 2], nums[i - 1]);
            }
            if (i >= 3) {
                dp[i] = dp[i] || (dp[i - 3] && validThree(nums[i - 3], nums[i - 2], nums[i - 1]));
            }
        }
        return dp[n];
    }

    public static boolean validTwo(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean validThree(int num1, int num2, int num3) {
        return (num1 == num2 && num1 == num3) || (num1 + 1 == num2 && num2 + 1 == num3);
    }
}
