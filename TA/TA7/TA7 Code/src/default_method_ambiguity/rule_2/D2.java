package default_method_ambiguity.rule_2;

import default_method_ambiguity.B;

public class D2 implements B {
    public static void main(String[] args) {
        new D2().printName();
    }
}

//Output: from B

// For D the most specific sub-interface is B