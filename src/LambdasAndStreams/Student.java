package LambdasAndStreams;

public class Student implements Comparable<Student>{
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name , double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    // desc order of age
    @Override
    public int compareTo(Student other) {
        // this object : comes first return -1
        // other object : comes first return 1
        // return 0;
        if(this.age > other.age ){
            return -1;
        } else if(this.age < other.age ){
            return 1;
        }
        return 0;
    }
}
