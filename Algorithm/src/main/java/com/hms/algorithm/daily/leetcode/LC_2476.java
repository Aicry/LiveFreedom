package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hms.algorithm.daily.utils.BinarySearchTree.buildBinarySearchTree;

/**
 * @ClassName LC_20250225_2476
 * @Author hms
 * @Date 2024/2/25 12:19
 * @Description TODO
 */
public class LC_2476 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(ArrayHandler.toStringArray("[6,2,13,1,4,9,15,null,null,null,null,null,null,14]"));
        TreeNode treeNode = buildBinarySearchTree(strings, 0);
        List<Integer> queries = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        closestNodes(treeNode, queries);

    }

    public static List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int maxVal = -1, minVal = -1;
            int idx = binarySearch(arr, queries.get(i));
            if (idx != arr.size()) {
                maxVal = arr.get(idx);
            }
            if (idx > 0) {
                minVal = arr.get(idx - 1);
            }
            if (idx<arr.size() && arr.get(idx).equals(queries.get(i))) {
                minVal = queries.get(i);
            }
            List<Integer> list2 = new ArrayList<Integer>();
            list2.add(minVal);
            list2.add(maxVal);
            result.add(list2);

        }

        return new ArrayList<>();
    }

    public static int binarySearch(List<Integer> arr, Integer target) {
        int left = 0;
        int right = arr.size();
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (arr.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void inorder(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
        inorder(treeNode.left, res);
        if (treeNode.val > 0) {
            res.add(treeNode.val);
        }
        inorder(treeNode.right, res);
    }
}
