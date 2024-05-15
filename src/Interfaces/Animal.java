package Interfaces;

public abstract class Animal {
    private int id;
    int noOfLegs;
    String type;

    void eat(){
        System.out.println("Eat");
    }

    abstract void walk();
}
