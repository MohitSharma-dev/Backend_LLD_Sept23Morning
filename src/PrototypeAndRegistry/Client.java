package PrototypeAndRegistry;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student st = new Student();
        st.batch = "Apr23Student";

        studentRegistry.register("Apr23" , st);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st1 = studentRegistry.get("Apr23");
    }
}
