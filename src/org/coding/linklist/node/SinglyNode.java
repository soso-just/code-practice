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
}
