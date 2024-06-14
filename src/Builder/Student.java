package Builder;

public class Student {
    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    Student(StudentBuilder builder) {
        // validations
        if(builder.age < 20){
            throw new IllegalArgumentException("Age must be at least 20");
        }
        if(builder.gradYear > 2024){
            throw new IllegalArgumentException("GradYear must be smaller than 2024");
        }
//        if(builder.name == null){
//            throw new IllegalArgumentException("Name cannot be null");
//        }

        age = builder.age;
        name = builder.name;
        batch = builder.batch;
        gradYear = builder.gradYear;
        if(builder.course != null){
            this.course = builder.course;
        } else {
            this.course = "Academy";
        }

    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
