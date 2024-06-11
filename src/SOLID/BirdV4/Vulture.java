package SOLID.BirdV4;

public class Vulture extends BirdV3 implements Flyable {
    FlyHigh fh = new FlyHigh();

    @Override
    public void fly() {
//        System.out.println("Flying High");
        fh.flyHigh();
    }

    @Override
    void makeSound() {

    }
}
