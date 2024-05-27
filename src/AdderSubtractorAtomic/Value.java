package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    public AtomicInteger value = new AtomicInteger(0);
}
// CAS : Compare and swap

// t <- value 0              t <- value 0 , x <- value
// t = t + i  1              t = t - i -1
// t -> value  1             if (value == x)
//                              t -> value -1
//                           else
//                                tryAgain();