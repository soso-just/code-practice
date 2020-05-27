package org.coding.multithread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockT01 {

    public static void main(String[] args) {

//        TimeUnit.SECONDS.sleep();

        ReentrantLock lock  = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
