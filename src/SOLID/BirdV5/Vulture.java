package SOLID.BirdV5;

public class Vulture extends BirdV3 implements Flyable {
    FlyingBehaviour fh;

    Vulture(FlyingBehaviour fh){
        this.fh = fh;

    }

    @Override
    public void fly() {
//        System.out.println("Flying High");
        fh.makeFly();
    }

    @Override
    void makeSound() {

    }
}
