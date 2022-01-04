package default_method_ambiguity.rule_1;

import default_method_ambiguity.A;

public class D1 implements A {
    public void printName() {
        System.out.println("from D");
    }
    public static void main(String[] args) {
        new D1().printName();
    }
}

//Output: from D

// D implementations the default method

