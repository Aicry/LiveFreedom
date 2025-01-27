package com.hms.algorithm.daily.leetcode;

import java.util.Stack;

/**
 * @Author Hms
 * @Date 2024/08/25 14:08
 **/
public class LC_227 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char preSign = '+';
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                        break;
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        LC_227 lc227 = new LC_227();
        lc227.calculate(s);
    }
}
