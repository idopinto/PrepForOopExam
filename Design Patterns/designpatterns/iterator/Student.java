package designpatterns.iterator;

/**
 * @author Ohad Klein
 */
public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + Integer.toString(age);
    }
}
