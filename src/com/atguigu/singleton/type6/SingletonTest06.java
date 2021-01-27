package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println(singleton == singleton2);
        System.out.println("singleton.hashCode() = " + singleton.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        
        return instance;
    }
}