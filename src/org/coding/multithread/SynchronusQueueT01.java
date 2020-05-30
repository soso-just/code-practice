package org.coding.multithread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronusQueueT01 {
    static  SynchronousQueue queue = new SynchronousQueue();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(5);
            queue.put("test");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
