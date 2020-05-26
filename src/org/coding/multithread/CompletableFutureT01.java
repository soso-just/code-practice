package org.coding.multithread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureT01 {

    public static void main(String[] args) throws Exception {
        CompletableFuture<Double> future = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1.0;
        });
        CompletableFuture<Double> future1 = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 2.0;
        });
        Object res1 = CompletableFuture.allOf(future,future1).join();
        System.out.println(res1);
//        System.out.println(future1.get());
     }
}
