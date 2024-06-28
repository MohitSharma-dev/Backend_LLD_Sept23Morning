package Decorator;

public class Milk implements AddOn{
    Beverage b;
    public Milk(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return b.getCost() + 10;
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk cost: " + getCost());
    }
}
