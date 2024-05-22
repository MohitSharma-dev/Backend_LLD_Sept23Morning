package AdderSubtractorLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    Adder(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }
    public Void call (){
//        lock.lock();
        for(int i = 1;i <=5000; i++){
            lock.lock();
            System.out.println("Adding " + i);
            this.v.value += i;
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}

