package org.coding.tree.leetcode;

/**
 * 二叉树最大深度
 */
public class BinaryTreeDepth {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 二叉树最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        int maxDepth = Math.max(leftMaxDepth, rightMaxDepth) +1;
        return maxDepth;
    }

}
