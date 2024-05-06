package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
        x.age = 35;
        Student y = new Student();
        y.age += 10;
        Student z = new Student();
//        z = y;
//        z.age += 10;
//        z.psp = 90.0;
        System.out.println(x.age);
        // Private attributes can't be accessed outside the class
//        x.name = "Mohit";
        x.setName("Mohit");
    }
}
// x = 752
// y = 752
// z = 752