package com.hms.algorithm.daily.leetcode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LC_255
 * @Author hms
 * @Date 2024/3/3 10:33
 * @Description TODO
 */
public class LC_255 {

    private static Queue<Integer> queue;

    public LC_255() {
        queue = new LinkedList<>();
    }

    public static void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public static int pop() {
        if(!queue.isEmpty()) {
            return queue.poll();
        }
        return 0;
    }

    public static int top() {
        if(!queue.isEmpty()) {
            return queue.peek();
        }
        return 0;
    }

    public static boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

    }
}

