package org.coding.linklist.leetcode;

import java.util.*;

public class NTree {

    /**
     * 树节点内部类
     */
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    /**
     * 前序遍历_递归
     * @param root
     * @return
     */
    public List<Integer> preorder_recursion(Node root) {
        List<Integer> resultList = new ArrayList<>();
        preorder(root,resultList);
        return resultList;
    }

    private List<Integer> preorder(Node node, List<Integer> resultList) {
        if (node == null) {
            return resultList;
        }else{
            resultList.add(node.val);
        }
        for (Node childrenNode : node.children){
            if (childrenNode != null) {
                preorder(childrenNode, resultList);
            }
        }
        return resultList;
    }


    /**
     * 前序遍历_迭代
     * 效率不如递归
     * @param root
     * @return
     */
    public List<Integer> preorder_iteration(Node root) {
        List<Integer> resultList = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if (root == null) {
            return resultList;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            Node lastNode = stack.pollLast();
            if (lastNode ==null) {
                continue;
            }
            resultList.add(lastNode.val);
            List<Node> childrenNodes = lastNode.children;
            /**
             * 此处 需要将子节点逆序压栈，保证最左子节点在栈顶
             */
            ListIterator<Node> iterator = childrenNodes.listIterator(childrenNodes.size());
            while (iterator.hasPrevious()){
                stack.add(iterator.previous());
            }

        }
        return resultList;
    }

}
