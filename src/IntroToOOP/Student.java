package IntroToOOP;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;
    Exam exam;
    static int noOfStudents ;

    // static block

    static {
        // static block will run time when the class loads
        // You can write as many static blocks as you want
        // It will be executed one after another
        // write the logic
        noOfStudents = 0;
        try{

        } catch(){

        }
    }

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
        Student.noOfStudents++;
    }

    public Student(String name , int age){
        this.name = name;
        this.age = age;
        this.exam = new Exam(1 , 90);
        Student.noOfStudents++;
    }

    public Student (String name , int age, double psp){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.exam = new Exam(1 , 90);
        Student.noOfStudents++;
    }

    public Student(Student other){
        this.psp = other.psp;
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
        // over here you are just copying the references not the actual data
        this.exam  = new Exam(other.exam);
        Student.noOfStudents++;
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

    static int getNoOfStudents(Student st){
//        You can't directly access non-static members from the static functions
//        if(name == "Mohit"){
//
//        }
        Student x = new Student(st);
        if(st.name.equals("Mohit")){
            return Student.noOfStudents;
        }
        return Student.noOfStudents;
    }
}

// access the value
// modify the value