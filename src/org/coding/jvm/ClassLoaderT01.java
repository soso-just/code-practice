package org.coding.jvm;

public class ClassLoaderT01 {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader().loadClass());
    }
}
