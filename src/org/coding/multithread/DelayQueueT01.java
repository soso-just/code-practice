package org.coding.multithread;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueT01 {

    public static void main(String[] args) {

        DelayQueue queue = new DelayQueue();
        DelayUser user = new DelayUser();
        queue.add(user);
    }

     static class DelayUser implements Delayed{
         @Override
         public int compareTo(Delayed o) {
             return 0;
         }

         @Override
         public long getDelay(TimeUnit unit) {
             return 0;
         }

         public DelayUser() {
         }
     }
}
