package org.coding.multithread;

import java.util.concurrent.*;

public class FutureTaskT01 {

    private static ExecutorService service = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws Exception{
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            return 10;
        });
        service.submit(futureTask);
        System.out.println(futureTask.get());
    }
}


