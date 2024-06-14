package Builder;

public class Client {
    public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setBatch("Apr23");
        studentBuilder.setGradYear(2025);

        Student s = new Student(studentBuilder);

    }
}
