package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private transient int id; // Notice the new modifier!
    private int age;

    public Employee() {
    }

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}