package com.hms.algorithm.daily.leetcode;

import java.util.Stack;

/**
 * @ClassName LC_232
 * @Author hms
 * @Date 2024/3/4 19:49
 * @Description TODO
 */
public class LC_232 {

    Stack<Integer> stack1;

    Stack<Integer> stack2;

    public LC_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        if(!stack2.empty()) {
            return stack2.peek();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.empty()&&stack1.empty();
    }
}
