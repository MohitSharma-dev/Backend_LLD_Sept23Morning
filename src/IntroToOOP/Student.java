package IntroToOOP;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;

    // constructor helps you to initialise the object
//    Student(){
//
//    }

    public Student(){
        this.name = "<Mohit";
        this.age = 25;
        this.batch = "new_batch";
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