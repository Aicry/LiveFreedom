package com.hms.algorithm.daily.leetcode;

import java.util.Arrays;

/**
 * @ClassName LC_20240123
 * @Author hms
 * @Date 2024/1/23 21:52
 * @Description TODO
 */
public class LC_20240123 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 3, 4};
        System.out.println(alternatingSubarray(nums));
    }

    public static int alternatingSubarray(int[] nums) {
        int res = -1;
        int n = nums.length;
        int firstIndex = 0;
        for (int i = 1; i < n; i++) {
            int length = i - firstIndex + 1;
            if (nums[i] - nums[firstIndex] == (length - 1) % 2) {
                res = Math.max(res, length);
            } else {
                if (nums[i] - nums[i - 1] == 1) {
                    firstIndex = i - 1;
                    res = Math.max(res, 2);
                } else {
                    firstIndex = i;
                }
            }
        }
        return res;
    }

}
