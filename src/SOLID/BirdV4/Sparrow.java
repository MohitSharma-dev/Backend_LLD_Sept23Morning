package SOLID.BirdV4;

public class Sparrow extends BirdV3 implements Flyable {
    @Override
    public void fly() {
        // algo of multiple lines to fly low
        System.out.println("Flying Low");
    }

    @Override
    void makeSound() {

    }
}
