package org.coding.multithread;

import sun.misc.Unsafe;

public class DCLSingleton {
    /**
     * 是否加 {@link volatile}
     * volatile 禁止指令重排，防止在锁外面的检查不为null返回半初始化的对象
     */
    private volatile static DCLSingleton INSTANCE = null;

    /**
     * 使用对象加锁做并发时，要在对象加final
     */
    private static Unsafe unsafe = Unsafe.getUnsafe();


    private DCLSingleton() {
    }

    public static DCLSingleton getInstance(){
        /**
         * 一系列业务逻辑
         */
        if (INSTANCE == null) {
            synchronized (DCLSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new DCLSingleton();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(unsafe.addressSize());
    }
}
