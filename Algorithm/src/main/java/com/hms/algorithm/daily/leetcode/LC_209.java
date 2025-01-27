package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

/**
 * @Author Hms
 * @Date 2024/08/27 22:07
 **/
public class LC_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] intArray = ArrayHandler.toIntArray("[2,3,1,2,4,3]");
        LC_209 lc209 = new LC_209();
        System.out.println(lc209.minSubArrayLen(7, intArray));
    }
}
