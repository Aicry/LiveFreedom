package com.hms.algorithm.daily.leetcode;

import java.util.*;

/**
 * @ClassName LC_20240223
 * @Author hms
 * @Date 2024/2/23 20:32
 * @Description TODO
 */
public class LC_2583 {
    public static void main(String[] args) {

    }

    public static long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        List<Long> levelSumArray = new ArrayList<Long>();
        while (!queue.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<TreeNode>(queue);
            long levelSum = 0;
            queue.clear();
            for (TreeNode node : levelNodes) {
                levelSum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levelSumArray.add(levelSum);
        }
        if (levelSumArray.size() < k) {
            return -1;
        }
        Collections.sort(levelSumArray);
        return levelSumArray.get(levelSumArray.size() - k);
    }
}
