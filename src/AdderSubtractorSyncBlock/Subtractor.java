package AdderSubtractorSyncBlock;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value x){
        v = x;
    }

    public Void call (){
        for(int i = 1;i <=5000; i++){
            synchronized (v){
                this.v.value -= i;
            }

        }
        return null;
    }
}
