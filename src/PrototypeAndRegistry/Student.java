package PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    int id;
    String name;
    String batch;

    Student(){

    }

    Student(Student st){
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    @Override
    public Student copy() {
        Student st = new Student(this);
        return st;
    }
}
