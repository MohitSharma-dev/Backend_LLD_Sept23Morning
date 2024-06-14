package Builder;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder = new StudentBuilder();
//        StudentBuilder studentBuilder = Student.getBuilder();
//        studentBuilder.setAge(25);
//        studentBuilder.setBatch("Apr23");
//        studentBuilder.setGradYear(2025);

        Student s =
                Student.getBuilder()
                .setAge(25)
                .setGradYear(2025)
                .setBatch("Apr23")
                .setName("Mohit")
                        .build();


//        Student s = new Student(studentBuilder);
//        s.age = 25;

    }
}
