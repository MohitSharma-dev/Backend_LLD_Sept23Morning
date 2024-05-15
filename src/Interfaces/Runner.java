package Interfaces;

public interface Runner {
    int x = 5; // public, static and final
    // Every function is public in interfaces
    void run();
    default void walk(){
        System.out.println("walk");
    }

    // utility methods
    static void doSomething(){
        System.out.println("do something");
    }
}
