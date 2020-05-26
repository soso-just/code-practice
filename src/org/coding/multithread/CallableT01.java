package org.coding.multithread;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class CallableT01 {
    private static ExecutorService service = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws Exception{
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                TimeUnit.SECONDS.sleep(3);
                return 1;
            }
        };
        Future<Integer> future = service.submit(callable);
        System.out.println(future.get());
    }
}
