package Builder;

public class StudentBuilder {
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
        return new Student(this);
    }
}
