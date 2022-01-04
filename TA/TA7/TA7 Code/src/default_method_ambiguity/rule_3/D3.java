package default_method_ambiguity.rule_3;

import default_method_ambiguity.A;
import default_method_ambiguity.C;

public class D3 implements C, A {
    public static void main(String[] args) {
        new D3().printName();
    }

    public void printName() {
        A.super.printName();
    }
}

//Output: from A

// Here we have ambiguity, that's why we need to specify explicitly the interface from which to take the implementation.