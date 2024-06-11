package SOLID.BirdV3;

public class Vulture extends BirdV3 implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying High");
    }

    @Override
    void makeSound() {

    }
}
