package com.hms.algorithm.daily.leetcode;

/**
 * @ClassName LC_299
 * @Author hms
 * @Date 2024/3/10 20:18
 * @Description TODO
 */
public class LC_299 {

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
    }

    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int[] cntS = new int[10];
        int[] cntG = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bulls;
            } else {
                ++cntS[secret.charAt(i) - '0'];
                ++cntG[guess.charAt(i) - '0'];
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; i++) {
            cows += Math.min(cntS[i], cntG[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
