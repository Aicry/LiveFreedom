package com.hms.algorithm.daily.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LC_20240128
 * @Author hms
 * @Date 2024/1/28 19:33
 * @Description TODO
 */
public class LC_20240128 {
    public static void main(String[] args) {
        boolean measureWater = canMeasureWater(13, 11, 1);
        System.out.println(measureWater);
    }

    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (targetCapacity == jug1Capacity || targetCapacity == jug2Capacity ||
                targetCapacity == (jug1Capacity + jug2Capacity) || targetCapacity == Math.abs(jug1Capacity - jug2Capacity)) {
            return true;
        }
        int max = Math.max(jug1Capacity, jug2Capacity);
        int min = Math.min(jug1Capacity, jug2Capacity);
        List<Integer> nums = new ArrayList<>();
        while (max > min) {
            nums.add(max - min);
            max = max - min;
        }
        max = Math.max(jug1Capacity, jug2Capacity);
        min = Math.min(jug1Capacity, jug2Capacity);
        nums.add(max);
        while (min <= max) {
            nums.add(min);
            min += min;
        }
        nums.add(min % max);

        max = Math.max(jug1Capacity, jug2Capacity);
        min = Math.min(jug1Capacity, jug2Capacity);
        for (Integer num : nums) {
            if (num == targetCapacity) {
                return true;
            }
            if (num > min && (num + min == targetCapacity)) {
                return true;
            }
            if (num <= min && (num + min == targetCapacity || num + max == targetCapacity)) {
                return true;
            }
        }
        return false;
    }
}
