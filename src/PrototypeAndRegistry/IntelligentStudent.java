package PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    int iq;
    IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    public IntelligentStudent copy() {
        IntelligentStudent st = new IntelligentStudent(this);
        return st;
    }
}
