package org.coding.multithread;

import java.util.concurrent.TimeUnit;

public class Account {
    String name;
    int value;

    public Account(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value, int timeout) throws Exception{
        System.out.println("进来啦。。。。。"+ value);
        TimeUnit.SECONDS.sleep(timeout);
        this.value = value;
    }

    public static void main(String[] args) throws Exception{
        Account account1 = new Account("zhang3", 100);
        Account account2= new Account("li4",400);
            new Thread(()->{
                try {
                    account1.setValue(200,4);
                    System.out.println(account2.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()->{
                try {
                    account2.setValue(800, 2);
                    System.out.println(account1.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();



        System.out.println("dsadsadasdsa");
    }
}
