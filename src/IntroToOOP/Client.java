package IntroToOOP;

public class Client {
    public static void doSomething(){
        System.out.println("Do something");
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.age = 35;
        Student y = new Student();
        y.age += 10;
        Student z = new Student();
        doSomething();
//        z = y;
//        z.age += 10;
//        z.psp = 90.0;
        System.out.println(x.age);
        // Private attributes can't be accessed outside the class
//        x.name = "Mohit";
        x.setName("Mohit");

        Student s1 = new Student("Akash" , 30);
        Student s2 = s1;
        int x5 = s2.age;
        Student copy1 = new Student(s1);
        System.out.println(copy1.age);
        System.out.println(Student.noOfStudents);
        System.out.println(Student.getNoOfStudents(s1));
    }
}
// x = 752
// y = 752
// z = 752

// Java will only provide default in case if you have not written any of the constructor
