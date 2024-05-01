package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

/**
 * @ClassName LC_88
 * @Author hms
 * @Date 2024/3/3 14:01
 * @Description TODO
 */
public class LC_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (nums2[i] >= nums1[j] && j < m) {
                j++;
            }
            for (int k = m; k > j; k--) {
                nums1[k] = nums1[k - 1];
            }
            nums1[j] = nums2[i];
            m++;
        }
    }

    public static void main(String[] args) {
        merge(ArrayHandler.toIntArray("[1,2,3,0,0,0]"), 3, ArrayHandler.toIntArray("[2,5,6]"), 3);
    }
}
