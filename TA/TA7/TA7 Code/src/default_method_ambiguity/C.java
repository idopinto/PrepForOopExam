package default_method_ambiguity;

public interface C {
    default void printName(){
        System.out.println("from C");
    }
}
