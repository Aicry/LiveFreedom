package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LC_20240217
 * @Author hms
 * @Date 2024/2/17 20:54
 * @Description TODO
 */
public class LC_20240217 {
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> nodeQueue = new ArrayDeque<Node>();;
        nodeQueue.offer(root);
        while (nodeQueue.size() > 0) {
            int cnt = nodeQueue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                Node poll = nodeQueue.poll();
                level.add(poll.val);
                for (Node node1 : poll.children) {
                    nodeQueue.offer(node1);
                }
            }
            res.add(level);
        }
        return res;
    }
    public static void main(String[] args) {
    }
}