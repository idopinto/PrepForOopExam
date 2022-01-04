package default_method_ambiguity;

import default_method_ambiguity.A;

public interface B extends A {
    default void printName() {
        System.out.println("from B");
    }
}