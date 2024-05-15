package Inheritance;

public class Student extends User {
    private String batch;
    double psp;

    Student(){
//        System.out.println("Student Constructor");
    }

    Student(String batch){
        this();
        this.batch = batch;
    }

    Student(String batch, double psp){
        this(batch);
        this.psp = psp;
    }

    void attendClass(){
        this.name = "Mohit";
        this.setId(5);
        super.login();
        System.out.println("Attend Class");
    }

    static void doSomething(){
        System.out.println("Student class do Something");
    }
}
