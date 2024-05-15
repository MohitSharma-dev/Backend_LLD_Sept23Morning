package Inheritance;

public class Client {
    public static void main(String[] args) {
//        User u = new User();


        User.doSomething();
        // for this static method of parent class if hidden
        Student.doSomething();


        Student st = new Student();
        st.doSomething();
        User u = new User();
        u.doSomething();
        User st1 = new Student();
        st1.doSomething();
        System.out.println("");
    }
}

// order of calling and order of execution