package InhertianceAndConstructors;

public class C extends B {

    C(){
        super(5);
        System.out.println("C constructor is executed");
    }

    C(String x){
        //super();
        // super can only be in the first line
        // has to be first line
        this(3); // C();
        System.out.println("Parameterised constructor of C is executed");
        // Error : call to super must be first statement in constructor
//        super(5);
    }

    C(int x){
        // super();
        super(x);
        System.out.println(x);
    }
}
