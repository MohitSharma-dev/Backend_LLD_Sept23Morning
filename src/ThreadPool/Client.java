package ThreadPool;

import IntroToThreads.HelloWorld2;
import IntroToThreads.HelloWorldPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
         // It will be calling x.run();

        // ThreadPool : Queue, mechanism , allocation
        // FixedThreadPool
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i = 1; i <= 100; i ++){
            if(i == 80){
                System.out.println();
            }
            NumberPrinter x1 = new NumberPrinter(i);
            es.execute(x1);
        }
    }
}
// creation of thread : itself takes some time
// context switching between all of them





// step 1: create a class for the task
// step 2 : implement runnable interface
// step 3 : Give the definition in the run function
// step 4 : Create the object of this class and pass it in the constructor of thread
// step 5 : .start()

// Which would print 1 - 100 , all of these in new threads

// Implementing Runnable vs extending Thread
// since you have already one class, now there is no more space of extension
// Thread also uses runnable
// Composition vs Inheritance

// run () : Can you return anything ? Callable
// ThreadPool : ExecutorService
// MultiThreaded merge sort

