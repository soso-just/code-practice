package org.coding.linklist.inversion;

import org.coding.linklist.node.SinglyNode;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SinglgLinkedList {
    /**
     * 头结点
     */
    SinglyNode head;

    /**
     * 尾结点
     */
    SinglyNode tail;

    public boolean add(int value){
        SinglyNode newNode = new SinglyNode(value);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            tail = head;
        }else{
            tail.setNext(newNode);
            tail=newNode;
        }

        return true;
    }

    public SinglgLinkedList() {
        head = null;
        tail = head;
    }

    public static void main(String[] args) {
        SinglgLinkedList singlgLinkedList = new SinglgLinkedList();
        singlgLinkedList.add(1);
        singlgLinkedList.add(2);
        System.out.println(singlgLinkedList);
//        new Thread()
        ExecutorService threadPool = Executors.newCachedThreadPool();
//        threadPool.execute();
    }
}
