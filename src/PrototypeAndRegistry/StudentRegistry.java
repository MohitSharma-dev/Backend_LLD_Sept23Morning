package PrototypeAndRegistry;

import java.util.Map;

public class StudentRegistry {
    private Map<String , Student> students;

    static {
        // initialising the students
    }

    public void register(String key , Student st){
        students.put(key , st);
    }

    public Student get(String key){
        return students.get(key).copy();
    }

}
