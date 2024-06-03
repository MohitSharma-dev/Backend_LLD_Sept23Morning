package LambdasAndStreams;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        // Runnable : Class which would implement our method
        // Method 2

        Runnable r = new ThreadedProgram();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hey!");
            }
        };

        Thread t = new Thread(runnable);

        // Lambdas
//        Runnable r2 = ( // try to take the parameter ) -> {// body };

        Runnable r2 = () -> {
            System.out.println("Hey!");
        };
        Thread t1 = new Thread(r2);
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Hey!"));

        // Comparator : functional interface : compare o1 , o2

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        Collections.sort(l1 , (o1 , o2) -> {
            if(o1 > o2) return -1;
            else if(o1 < o1) return 1;
            return 0;
        });


        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

        Stream<Integer> s1 =  l2.stream();

        // Terminal : forEach
        // As soon as you use any terminal method, the stream is closed.
        s1.forEach((elem) -> {
            System.out.println(elem);
        });

        // There is no change on the original collection in stream

        // Intermediate function : limit
        // Every intermediate function returns the stream

                l1
                .stream()
                .limit(4)
                .forEach((elem)->{
                    System.out.println(3 * elem);
                 });

        Stream<Integer> s3 =  l1.stream().limit(4);

        s3.forEach((elem)->{
            System.out.println(3 * elem);
        });

        List<Student> list1 = new ArrayList<>();
        Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
        Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
//        st1.compareTo(st2);
        list1.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        list1.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        list1.add(new Student(28 , 20.0 , "Rohan" , 90.0));


        // filter method : Intermediate

        list1
                .stream()
                .filter( (elem) -> {
                    return elem.attendance > 80.0;
                }).forEach((elem) ->{
                    System.out.println(elem.name + " " + elem.attendance);
                });

        // collect : Terminal

        List<Student> l3 =
                list1
                .stream()
                .filter( (elem) -> {
                    return elem.attendance > 80.0;
                })
                .collect(Collectors.toList());


        l3.add(st1);

        // map : intermediate method
        // transforms your data into a relevant data based on logic



        List<Integer> l4 =
                        l2
                        .stream().distinct()
                        .filter((elem) -> {
                            System.out.println("Filtering " + elem);
                            return elem % 2 == 0;
                        })
                        .map((elem) -> {
                            System.out.println("Mapping " + elem);
                            return elem * elem;
                        })
                                .sorted((o1 , o2) -> (o2 - o1))
                        .collect(Collectors.toList());


        l4.add(null);
        l4.add(null);
        l4.add(null);

        List<Integer> l5 =
                l4
                        .stream().distinct()
                        .collect(Collectors.toList());

        System.out.println("hey");
        System.out.println(l5);



         Optional<Integer> op1 =        l2
                        .stream().distinct()
                        .filter((elem) -> {
                            System.out.println("Filtering " + elem);
                            return elem % 2 == 0;
                        })
                        .map((elem) -> {
                            System.out.println("Mapping " + elem);
                            return elem * elem;
                        })
                        .findFirst();
        if(op1.isPresent()) {
            System.out.println(op1.get());
        }

        // find sum of the list

//        int sum = 0;
//        for(Integer elem : l5) {
//            sum += elem;
//        }

        // reduce is a terminal function
        // reduce basically returns one data based on the logic, tries to converge list in one answer


          Integer x9 =  l2.stream()
                .reduce(0 , (curr_sum , elem) -> curr_sum + elem);

        System.out.println(x9);

        // HW : find max element of the array

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // nested list
        System.out.println(listOfLists);

        List<Integer> lx1 =   listOfLists
                .stream()
                .flatMap((elem) -> {

                    return (elem).stream().map(elem1 -> elem1 * elem1);
                })
                .collect(Collectors.toList());

        System.out.println(lx1);






    }
}
