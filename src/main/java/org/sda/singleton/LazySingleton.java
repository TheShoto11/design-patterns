package org.sda.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        System.out.println("Inside method getInstance()");
        if (instance == null){
            System.out.println("Instance is null, creating a new one");
            instance = new LazySingleton();
        }
        System.out.println("Returning instance");
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);

        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton2);
    }
}
