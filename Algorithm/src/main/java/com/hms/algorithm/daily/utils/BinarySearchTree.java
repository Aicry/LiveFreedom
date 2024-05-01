package com.hms.algorithm.daily.utils;

import com.hms.algorithm.daily.leetcode.TreeNode;

import java.util.List;

/**
 * @ClassName BinarySearchTree
 * @Author hms
 * @Date 2024/2/25 13:54
 * @Description TODO
 */
public class BinarySearchTree {
    public static TreeNode buildBinarySearchTree(List<String> strings, int idx) {
        TreeNode treeNode = new TreeNode();
        if (idx < strings.size() && !strings.get(idx).equals("null")) {
            treeNode.val = Integer.parseInt(strings.get(idx));
            treeNode.left = buildBinarySearchTree(strings, 2 * idx + 1);
            treeNode.right = buildBinarySearchTree(strings, 2 * idx + 2);
        }
        return treeNode;
    }

    public static TreeNode getBinarySearchTreeNode(TreeNode treeNode, int val) {
        if (treeNode.val == val) {
            return treeNode;
        }
        if (treeNode.val < val) {
            return getBinarySearchTreeNode(treeNode.left, val);
        }
        return getBinarySearchTreeNode(treeNode.right, val);
    }
}
