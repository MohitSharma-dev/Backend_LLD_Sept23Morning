package Generics;

public class Pair <V, S>{
    V first;
    S second;

//    Pair(V first, S second){
//        this.first = first;
//        this.second = second;
//    }


    public V getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public <Z> Z doAgain(Z temp , V first){
        return temp;
    }

    // V , S will not be available over here
    // Generic Method
    public static <T , M> T doSomething(T first){
        return first;
    }

    public static <T> void dodo(){
        T temp = doSomething(null);
    }

}

