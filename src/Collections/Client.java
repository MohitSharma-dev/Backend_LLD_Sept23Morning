package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Collection : Container , group of objects
        // List , Set , Queue

        // List : ordered collection : insertion order
        // index : inserting , searching , random access
        // allow duplicate elements

        // array , dynamic / growable
        // random : O(1) : index
        // Not thread safe , not synchronized
        List<String> list = new ArrayList<String>();
        ArrayList<Integer> x1 = new ArrayList<>();

        // doubly linked List is used to implement this collection
        // random : O(N)
        // insertion and deletion
        // Not thread safe
        List<Integer> lis1 = new LinkedList<>();

        // ArrayList + Synchronized (Thread safe)
        List<Integer> lis2 = new Vector<>();

//      LIFO + thread safe
        List<Integer> lis3 = new Stack<>();

        // Set interface : no duplicate elements are allowed
        // generally not ordered
        // fast searching

        // no order
        // TC : avg O(1)
        // array of List
        Set<Integer> set1 = new HashSet<>();
        // insertion order
        // TC : avg O(1)
        // DLL (insertion order) + HashMap (searching)
        Set<Integer> set2 = new LinkedHashSet<>();
        // Natural sorting order
        // TC : O(log2N)
        // BBST : balanced binary search tree : Red black tree
        Set<Integer> set3 = new TreeSet<>();

        set1.add(16);
        set1.add(5);
        set1.add(2);
        set1.add(8);
        set1.add(1);

        set2.add(16);
        set2.add(5);
        set2.add(2);
        set2.add(8);
        set2.add(1);

        set3.add(16);
        set3.add(5);
        set3.add(2);
        set3.add(8);
        set3.add(1);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // Queue : DS is used to hold items before processing
        // order of processing : FIFO

        // Direct implementation : PQ

        // Queue is extending by another interface Deque

        Queue<Integer> q = new LinkedList<>();

        // natural sorted order
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(16);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }

        // Map : key, value
        Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map2 = new LinkedHashMap<>();
        Map<Integer,String> map3 = new TreeMap<>();
        Map<Integer,String> map4 = new Hashtable<>();

        List<Student> list1 = new ArrayList<>();
        Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
        Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
//        st1.compareTo(st2);
        list1.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        list1.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        list1.add(new Student(28 , 20.0 , "Rohan" , 90.0));


        Collections.sort(list1);

        for(Student student : list1) {
            System.out.println(student.name);
        }

        Collections.sort(list1 , new StudentPSPComparator());
        Collections.sort(list1 , (o1 , o2) -> o1.age - o2.age);

        // comparable is used for a single default ordering of any custom class
        // comparators provides multiple custom sorting rules for a single class
        Queue <Student> q1 = new PriorityQueue<>(new StudentPSPComparator());
    }
}
// concurrent
