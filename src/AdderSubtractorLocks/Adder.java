package AdderSubtractorLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock, lock2;

    Adder(Value x, Lock lock, Lock lock2){
        v = x;
        this.lock = lock;
        this.lock2 = lock2;
    }
    public Void call (){
//        lock.lock();
        for(int i = 1;i <=5000; i++){
            lock2.lock();
            lock.lock();
            System.out.println("Adding " + i);
            this.v.value += i;
            lock.unlock();
            lock2.unlock();
        }
//        lock.unlock();
        return null;
    }
}

