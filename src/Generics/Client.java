package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<Integer , String> p1 = new Pair<>();
        p1.doAgain(90.0 , 75);
        Pair<Integer , String> p2 = new Pair<Integer , String>();

        Pair<String , String> p3 = new Pair<String , String>();
        Pair<String , Double> p4 = new Pair<String , Double>();

        p1.setFirst(5);

        Integer x = p1.getFirst();
        // Interfaces can take the generic types
        List<Pair<Integer , String>> list = new ArrayList<>();

        // int , double , long
        // Integer , Double  , Long

        // Raw types
        Pair p = new Pair();
//        Pair<Object , Object> p = new Pair();

        // Backward compatibility

        HashMap h = new HashMap();
        h.put("Mohit" , 7);
        h.put(7  , "Mohit");

        String x9 =  Pair.doSomething("Mohit");
        String y = Pair.<String , Integer>doSomething("Mohit");
//        int x7 = 5;
        Pair.dodo();
//        Integer x5 = x7; // int
    }
}
// Object : Integer , Double , Long
// Collection

// Autoboxing

// Generic types
// Raw types
// Generic Methods


