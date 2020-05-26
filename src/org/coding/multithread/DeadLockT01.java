package org.coding.multithread;

public class DeadLockT01 {
    private static Object lockObj1 = new Object();
    private static Object lockObj2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized(lockObj1){
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockObj2){
                    System.out.print("1");
                }
            }
    }).start();


        new Thread(()->{

            synchronized (lockObj2){
                synchronized (lockObj1){
                    System.out.println(2);
                }
            }
        }).start();
    }
}
