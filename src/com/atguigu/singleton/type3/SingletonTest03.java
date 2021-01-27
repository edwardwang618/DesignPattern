package com.atguigu.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    
        System.out.println(singleton == singleton2);
        System.out.println("singleton.hashCode() = " + singleton.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
}