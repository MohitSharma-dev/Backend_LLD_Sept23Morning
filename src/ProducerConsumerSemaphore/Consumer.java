package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumer(Store st, Semaphore producerSemaphore, Semaphore consumerSemaphore){
       this.store = st;
       this.producerSemaphore = producerSemaphore;
       this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while(true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            producerSemaphore.release();


        }
    }
}
