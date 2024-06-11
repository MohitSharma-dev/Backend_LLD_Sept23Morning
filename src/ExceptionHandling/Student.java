package ExceptionHandling;

import java.sql.SQLException;

public class Student {
    static int doSomething(int x) throws ClassNotFoundException, SQLException , RandomException {
        if(x == 0){
            // Run time exception : Unchecked : Run time
            throw new ArithmeticException();
        } else if (x % 2 == 0){
            // Exception : checked  : Compile time
            throw new ClassNotFoundException();
        } else if (x % 3 == 0){
            throw new SQLException();
        } else if (x % 7 == 0){
            throw new NullPointerException();
        } else if (x % 5 == 0){
            throw new RandomException();
        }

        return 1 / x;
    }
}
