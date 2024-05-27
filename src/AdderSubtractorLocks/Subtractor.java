package AdderSubtractorLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock, lock2;


    Subtractor(Value x, Lock lock, Lock lock2){
        v = x;
        this.lock = lock;
        this.lock2 = lock2;
    }

    public Void call (){
        for(int i = 1;i <=5000; i++){
            lock.lock();
            lock2.lock();
            System.out.println("Subtracting " + i);
            this.v.value -= i;
            lock2.unlock();
            lock.unlock();

        }
        return null;
    }
}
