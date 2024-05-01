package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.Arrays;

/**
 * @ClassName LC_20240220
 * @Author hms
 * @Date 2024/2/20 21:34
 * @Description TODO
 */
public class LC_105 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode treeNode = new TreeNode();
        if(preorder.length==0){
            return new TreeNode();
        }
        treeNode.val = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == treeNode.val) {
                index = i;
            }
        }
        treeNode.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        treeNode.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return treeNode;
    }
    public static void main(String[] args) {

        TreeNode treeNode = buildTree(
                ArrayHandler.toIntArray("[3,9,20,15,7]")
                , ArrayHandler.toIntArray("[9,3,15,20,7]")
        );
        System.out.println(treeNode.toString());
    }
}

