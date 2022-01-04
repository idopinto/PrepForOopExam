package default_method_ambiguity;

public interface A {
    default void printName(){
        System.out.println("from A");
    }
}
