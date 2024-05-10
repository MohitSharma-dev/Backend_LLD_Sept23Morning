package IntroToOOP;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;
    Exam exam;

    // constructor helps you to initialise the object
//    Student(){
//
//    }
//        new Student();
    public Student(){
        this.name = "<Mohit";
        this.age = 25;
        this.batch = "new_batch";
        this.exam = new Exam(1 , 90);
    }

    public Student(String name , int age){
        this.name = name;
        this.age = age;
        this.exam = new Exam(1 , 90);
    }

    public Student (String name , int age, double psp){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.exam = new Exam(1 , 90);
    }

    public Student(Student other){
        this.psp = other.psp;
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
        // over here you are just copying the references not the actual data
        this.exam  = new Exam(other.exam);

        // Student st2 = st1;
    }


    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void print(){
        System.out.println("Name: " + name);
    }

    void attendClass(){
        System.out.println("Attending Class");
    }
}

// access the value
// modify the value