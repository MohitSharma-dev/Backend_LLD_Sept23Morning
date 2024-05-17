package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter x = new HelloWorldPrinter();
        System.out.println("Client main : " + Thread.currentThread().getName());
        Thread t = new Thread(x);
        x.run();
        t.start(); // It will be calling x.run();

        for(int i = 1; i <= 100; i ++){
            NumberPrinter x1 = new NumberPrinter(i);
            Thread t1 = new Thread(x1);
            t1.start();
        }

        Thread t3 = new HelloWorld2();
        t3.start();
    }
}

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

