package org.coding.linklist.node;

public class SinglyNode {
    int data;
    SinglyNode next;

    public SinglyNode() {
    }

    public SinglyNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    public static void main(String[] args) {
        SinglyNode head =  new SinglyNode(1);
        SinglyNode curNode = head;
        for (int i=2 ; i< 6; i++){
            curNode.setNext(new SinglyNode(i));
            curNode = curNode.getNext();
        }
        printNodeData(head);
        System.out.println("----------------------------------");
        head = reversal(head);
        printNodeData(head);

    }

    private static SinglyNode reversal(SinglyNode head) {
        if (head == null) {
            return head;
        }
        SinglyNode curNode = head;
        SinglyNode preNode = null;
        while (curNode != null){
            SinglyNode tempNode = curNode.next;
            curNode.setNext(preNode);
            preNode = curNode;
            curNode = tempNode;
        }
        return preNode;

    }

    private static void printNodeData(SinglyNode head) {
        SinglyNode curNode = head;
        while (curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.getNext();
        }
    }
}
