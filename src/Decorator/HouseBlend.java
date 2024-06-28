package Decorator;

public class HouseBlend implements Beverage {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDesc() {
        System.out.println("HouseBlend :" + getCost());
    }
}
