package Decorator;


public class Client {
    public static void main(String[] args) {
        // Double Mocha DarkRoast with added Milk
        Beverage b = new DarkRoast();
//        b.getDesc();

        b = new Mocha(b);
        b = new Mocha(b);
        b = new Milk(b);

        b.getDesc();
    }
}
