package Generics;

import java.util.List;

public class AnimalUtility {
    // extends : Anything Animal or under it (Class or interface)
    public static <T extends Animal> List<T> printAnimalNames(List<T> animals){
//        animals.add(new Dog(""));
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
        return animals;
    }

    public static void printAnimalNames2(List< ? extends Animal > animals){
//        animals.add(new Dog(""));
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }
}
