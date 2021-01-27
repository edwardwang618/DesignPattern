package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println(singleton == singleton2);
        System.out.println("singleton.hashCode() = " + singleton.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }
    
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}