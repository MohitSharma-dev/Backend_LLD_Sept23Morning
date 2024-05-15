package Inheritance;

public class User {
    private int id;
    String name;
    String password;

    User(){
//        System.out.println("User Constructor");
    }

    void login(){
        System.out.println("User logged in");
    }

    void setId(int id){
        this.id = id;
    }

    static void doSomething(){
        System.out.println("User static function");
    }
}
