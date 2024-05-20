package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8  , 1 ,2 , 9 , 6 , 3 , 7, 5);
        // sort this list
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter arraySorter =  new Sorter(list, es);


        Future<List<Integer>> sortedArrayFuture =  es.submit(arraySorter);

        List<Integer> ans =  sortedArrayFuture.get();
        System.out.println(ans);
    }
}
