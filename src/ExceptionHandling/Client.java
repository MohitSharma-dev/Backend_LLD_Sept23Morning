package ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void test(int a){
        test(a * a);
    }


    public static void main(String[] args) {

        try {
            // put the code which can throw the exception in the try block
            Student.doSomething(4);

            // close the db connection
            // if any exception is thrown then you will go to the catch
        } catch (RandomException r){
            // if you want to resolve it or you want to handle it gracefully
            System.out.println("Random exception is caught");
            // close the db connection
        } catch (SQLException s){
            System.out.println("SQL exception is caught");
            // close the db connection
        } catch (ClassNotFoundException c){
            System.out.println();
            // close the db connection
        } catch (Exception e){

        } finally {
            // finally blocks irrespective of try and catch
            // close the db connection
        }

        // db connectio
        test(5);
    }
}

// A -> B -> C -> D -> Exception

// A , B , C , D , Exception