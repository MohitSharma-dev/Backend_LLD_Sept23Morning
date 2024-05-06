package accessModifiers;

import IntroToOOP.Student;

public class Client {
    public static void main(String[] args) {
        Student y = new Student();
//        y.name = "Mohit";
        // age is default , you can't access in different package
//        y.age = 45;
//        y.setName("Sharma");
        y.batch = "Sept23";
        // protected can't be access outside the package except for the child class
//        y.age = 90.0;
    }
}

// private : only same class
// default : same class + package : Package level protected
// protected : same class + package + child_class_outside_package
// public : anywhere