package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hms.algorithm.daily.utils.BinarySearchTree.buildBinarySearchTree;

/**
 * @ClassName LC_20250225_235
 * @Author hms
 * @Date 2024/2/25 13:52
 * @Description TODO
 */
public class LC_235 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(ArrayHandler.toStringArray("[6,2,8,0,4,7,9,null,null,3,5]"));
        TreeNode treeNode = buildBinarySearchTree(strings, 0);
        TreeNode commonAncestor = lowestCommonAncestor(treeNode,
                new TreeNode(3, null, null),
                new TreeNode(7, null, null));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path_p = getPath(root, p);
        List<TreeNode> path_q = getPath(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < path_p.size() && i < path_q.size(); ++i) {
            if (path_p.get(i) == path_q.get(i)) {
                ancestor = path_p.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }

    public static List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while (node.val != target.val) {
            path.add(node);
            if (target.val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        path.add(node);
        return path;
    }
}
