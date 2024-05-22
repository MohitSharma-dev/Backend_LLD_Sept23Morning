package AdderSubtractorSyncBlock;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=5000; i++){
            synchronized (v){
                // put the critical section over here
                this.v.value += i;
            }
        }
        return null;
    }
}

