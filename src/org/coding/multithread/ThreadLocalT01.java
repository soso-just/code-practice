package org.coding.multithread;

public class ThreadLocalT01 {
    private  static ThreadLocal<Object> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(1);
        threadLocal.get();
        threadLocal.remove();
    }
}
