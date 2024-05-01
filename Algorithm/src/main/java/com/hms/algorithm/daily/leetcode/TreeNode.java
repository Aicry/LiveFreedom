package com.hms.algorithm.daily.leetcode;

/**
 * @ClassName TreeNode
 * @Author hms
 * @Date 2024/2/20 21:40
 * @Description TODO
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}