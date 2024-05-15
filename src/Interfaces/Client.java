package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();

        runners.add(new Dog());
        runners.add(new Dog());
        runners.add(new RoboticDog());

        for(Runner runner : runners) {
            runner.run();
            runner.walk();
        }
    }
}
