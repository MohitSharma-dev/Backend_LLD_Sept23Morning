package ThreadPool;

public class NumberPrinter implements Runnable {
    int noToPrint;

    NumberPrinter(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println(noToPrint + " " + Thread.currentThread().getName());
    }
}
