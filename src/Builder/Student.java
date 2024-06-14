package Builder;

public class Student {
    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    private Student(StudentBuilder builder) {
//        // validations
//        if(builder.age < 20){
//            throw new IllegalArgumentException("Age must be at least 20");
//        }
//        if(builder.gradYear > 2024){
//            throw new IllegalArgumentException("GradYear must be smaller than 2024");
//        }
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


    public static class StudentBuilder {

        int age;
        String name;
        String batch;
        int gradYear;
        String course;

        public void setCourse(String course) {
            this.course = course;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        Student build(){
            // validations
            if(age < 20){
                throw new IllegalArgumentException("Age must be at least 20");
            }
            if(gradYear > 2024){
                throw new IllegalArgumentException("GradYear must be smaller than 2024");
            }
            return new Student(this);
        }
    }

}
