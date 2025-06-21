package org.sda.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        System.out.println(singleton1);
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton2);
    }
}
