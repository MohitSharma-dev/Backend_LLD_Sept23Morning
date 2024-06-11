package SOLID.BirdV3;

public class Eagle extends BirdV3 implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying high");
    }

    @Override
    void makeSound() {

    }
}
