package org.coding.tree.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的遍历
 */
public class BinaryTreeTraversal {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 前序遍历_递归
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal_recursion(TreeNode root) {
        List<Integer> resultList= new LinkedList<>();
        preorderTraversal(root, resultList);
        return resultList;
    }

    private void preorderTraversal(TreeNode node, List<Integer> resultList) {
        if (node == null) {
            return ;
        }
        resultList.add(node.val);
        preorderTraversal(node.left, resultList);
        preorderTraversal(node.right, resultList);

    }

    /**
     * 前序遍历_迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal_iteration(TreeNode root) {
        List<Integer> resultList = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root == null) {
            return resultList;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode lastNode = stack.pollLast();
            if (lastNode == null) {
                continue;
            }
            resultList.add(lastNode.val);
            stack.add(lastNode.right);
            stack.add(lastNode.left);
        }
        return resultList;
    }

    /**
     * 中序遍历_递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_recursion(TreeNode root) {
        List<Integer> resultList = new LinkedList<>();
        inorderTraversal(root,resultList);
        return resultList;
    }

    private void inorderTraversal(TreeNode node, List<Integer> resultList) {
        if (node==null) {
            return;
        }
        inorderTraversal(node.left, resultList);
        resultList.add(node.val);
        inorderTraversal(node.right,resultList);
    }

    /**
     * 中序遍历_迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_iteration(TreeNode root) {
        List<Integer> resultList = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        while ((currentNode!=null) || (!stack.isEmpty())){
            while (currentNode != null) {
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pollLast();
            resultList.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return resultList;
    }


    /**
     * 后序遍历_递归
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal_recursion(TreeNode root) {
        List<Integer> resultList = new LinkedList<>();
        postorderTraversal(root, resultList);
        return resultList;
    }

    private void postorderTraversal(TreeNode node, List<Integer> resultList) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left,resultList);
        postorderTraversal(node.right,resultList);
        resultList.add(node.val);
    }

    /**
     * 后序遍历_迭代
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal_iteration(TreeNode root) {
        LinkedList<Integer> resultList = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode last = stack.pollLast();
            if (last == null) {
                continue;
            }
            resultList.addFirst(last.val);
            stack.add(last.left);
            stack.add(last.right);
        }
        return resultList;
    }

    /**
     * 深度优先遍历=前序遍历
     */

    /**
     * 广度优先遍历
     * Breath first search
     */
    public List<Integer> BFS(TreeNode root){
        LinkedList<Integer> resultList = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty()) {
            TreeNode last = queue.pollFirst();
            resultList.add(last.val);
            queue.addLast(last.left);
            queue.addLast(last.right);
        }
        return resultList;
    }
}
