package Decorator;

public class Mocha implements AddOn{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Mocha cost: " + getCost());
    }
}
