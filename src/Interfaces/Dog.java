package Interfaces;

public class Dog extends Animal implements Runner{
    public void run() {
        System.out.println(Runner.x);
        System.out.println("Dog running");
    }

    public void walk(){
        System.out.println("Dog walking");
    }
}

// child class can only have a less restricted access modifier