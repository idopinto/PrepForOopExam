import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class SmallQs {

    /*
    Question 1: Part 1 is the first comment, part 2 is the rest of the code
    In the get object method (whatever is decided to call it) you can use if statements or a switch.
    you can use enums or strings etc, the details don't really matter too much.
    The important issues are having 3 classes, all of them implementing a common interface and some get function for the object
    with ways to get one of the three different objects back.

    notes: a factory can also just be a method,
     */
    class Factory{

        /*
        Question 1 part 1:
        in Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
        When do we use a factory? We use it when we need a nice and simple way to create new objects, but the objects that we need to create might differ from case to case.
        This design pattern bundles them up neatly (single choice principle) and allows for more modular code (extendability etc) while also decoupling object creation from
        the rest of the program.
         */

        public CommonAttribute getCommonAttributeObject(String objectType){
            switch (objectType)
            {
                case "A":
                    return new A();
                case "B":
                    return new B();
                case "C":
                    return new C();
            }
            return null;
        }


    }

    interface CommonAttribute{

    }

    class A implements CommonAttribute{

    }

    class B implements CommonAttribute{

    }

    class C implements CommonAttribute{

    }

    /*
    Question 2
     */

    /*
    Q2 Part 1: There are many valid reasons, we'll accept anything that is true and makes sense.
    Here are some examples:
    We'll want to use interfaces when we want: multiple attributes whereas we can only inherit one class
    We'll want to use inheritance when we want shared fields (instead of just constant ones)
    We can also use information hiding for members in inheritance whereas in interfaces they are public
     */

    /*
    Q2 Part 2: No, all classes that we can create automatically inherit the Object class
     */

    /*
    Q3 Part 3: The Object class is the only class that does not inherit from anything else
     */


    /*
    Question 3 - is outside of SmallQs class
     */

    /*
    Question 4
    A design method which is “modular” should satisfy 4
    fundamental requirements:
    – Decomposability
        Decomposes a software problem into a small number of less
        complex sub-problems
        – These sub-problems are connected by a simple structure, and
        independent enough to allow further work to proceed separately on
        each of them

    – Composability
        A method satisfies Modular Composability if it produces
        software elements which may be freely combined with each
        other to produce new systems
    – Understandability
       A software design favors Modular Understandability if it
       produces software in which a human reader can understand
       each module without having to know anything about the others
    – Continuity
        Continuity – A method satisfies Modular Continuity if a small
        change in the problem specification triggers a change in just one
        module, or a small number of modules

     For this question it is enough to explain only 2 of these.
     There are many valid examples so any example that makes sense will get the full amount of points
     */

    /*
    Question 5:
    Q5 Part 1:
    Unlike Generics, arrays are covariant: if Child is a subtype of
    Parent, then the array type Child[ ] is a subtype of Parent[ ]
     */

    class Q5P1
    {
        class Parent{}

        class Child extends Parent{}

        Parent[] arr = new Child[10]; //compiles due to covariance!
    }

    /*
    Q5 Part 2:
    Generic are Invariant
    • Invariance: for any class / interface MyClass and two distinct
    types Type1 and Type2:
    • MyClass<Type1> is neither a subtype nor a supertype of
    MyClass<Type2>
     */

    class Q5P2{
        LinkedList<Object> = new LinkedList<String>(); //doesn't compile due to invariance
    }

    /*
    Q5 Part 3:
    We can use wildcards instead
     */

    class Q5P3{
        LinkedList<? extends Object> arr = new LinkedList<String>();
    }

    /*
    Question 6
     */

    /*
    Q6 Part 1:
    The syntax for a lambda function is the following
    () -> {}:
    1) () - holds the parameters
    2) -> - just a marking
    3) {} - the function's body
     */

    /*
    Q6 Part 2:
     */

    class Q6{
        @FunctionalInterface
        interface mathOp{
            float operate(float x, float y);
        }

        float makeMathOp(float x, float y){
            mathOp op = (a,b) -> {return a != 0 ? a/b : null;};
            return op.operate(x,y);
        }
    }


}
class Main {
         /*
        Q3 Part 1 is the implementation of cook pasta
         */

    public static void cookPasta() {

        final int COOKING_TIME = 30;
        final String PASTA_TYPE = "Whole Wheat";
        final String PASTA_SHAPE = "Curly";
        // ingredients

        Pasta pasta = new Pasta(PASTA_TYPE, PASTA_SHAPE);
        Pot pot = new Pot();
        Timer timer = new Timer();
        timer.setTimer(COOKING_TIME);

        pasta.breakPasta();
        pot.boil();
        pot.fill(pasta);
        timer.setTimer(COOKING_TIME);

        while( 0 < timer.getMinutesRemaining())
        {
            timer.setTimer(timer.getMinutesRemaining()-1);
        }
        System.out.println("The pasta is ready");
    }

    /*
    Q3 Part 2: they also need to make a main function and use their facade here!
     */
    public static void main(String[] args)
    {
        Chef chef = new Chef();
        chef.cookPasta();
    }


}

    class Timer {
        private int minutesRemaining;

        Timer() {
        }

        public void setTimer(int x) {
            this.minutesRemaining = x;
        }

        public int getMinutesRemaining() {
            return this.minutesRemaining;
        }
    }

    class Pot {
        boolean full = false;

        Pot() {
        }

        public void boil() {
            System.out.println("the water is boiling");
        }

        public void fill(Pasta pasta) {
            System.out.println("bloop");
            full = true;
        }
    }


    class Pasta {
        private String wheat;
        private String shape;
        private boolean broken = false;

        public Pasta(String wheat, String shape) {
            this.wheat = wheat;
            this.shape = shape;
        }

        public void breakPasta() {
            System.out.println("crack!");
            this.broken = true;
            System.out.println("the pasta is broken");
        }
    }

    /*
    Q3 Part 2: the answer is to use a Facade, in our case Chef is a facade for creating pasta
     */
    class Chef {
        private Pot pot;
        private Pasta pasta;
        private Timer timer;
        private static final int COOKING_TIME = 30;
        private static final String PASTA_TYPE = "Whole Wheat";
        private static final String PASTA_SHAPE = "Curly";

        public Chef() {
            this.pot = new Pot();
            this.pasta = new Pasta(PASTA_TYPE, PASTA_SHAPE);
            this.timer = new Timer();
            timer.setTimer(COOKING_TIME);
        }

        public void cookPasta(){
            pasta.breakPasta();
            pot.boil();
            pot.fill(pasta);
            timer.setTimer(COOKING_TIME);

            while( 0 < timer.getMinutesRemaining())
            {
                timer.setTimer(timer.getMinutesRemaining()-1);
            }
            System.out.println("The pasta is ready");
        }
    }

    /*
    Q3 Part 3:
    We use a Facade when we want to simplify a complex API
    It only simplifies using the API for the user but doesn't add any functionality.
     */

class PartTwoQ1{
    @FunctionalInterface
    public interface Function<T> {
        public T apply(T param);
    }

    Function<Function<Double>> myFunc = a -> b->a.apply(b);


}

@FunctionalInterface
interface Function<T> {
    public T apply(T param);
}

abstract class BiFunction {



    protected BiFunction biFunction;

    protected BiFunction(BiFunction biFunction) {
        this.biFunction = biFunction;
    }

    public BiFunction() {

    }

    public abstract Function<Integer> apply(Function<Integer> f1, Function<Integer> f2);

    public static void main(String[] args) {
        // to create composerAdder
        BiFunction biFunction = new Compose(new Adder());
    }
}

class Compose extends BiFunction{

    public Compose(BiFunction biFunction) {
        super(biFunction);
    }

    @Override
    public Function<Integer> apply(Function<Integer> f1, Function<Integer> f2) {
        Function<Integer> composition = a -> f1.apply(f2.apply(a));
        return a -> composition.apply(a);
    }


}


class Adder extends BiFunction{
    @Override
    public Function<Integer> apply(Function<Integer> f1, Function<Integer> f2) {
        Function<Integer> func = new Function<Integer>() {
            @Override
            public Integer apply(Integer param) {
                return null;
            }
        };
        Object obj = func;
        return a -> f1.apply(a) + f2.apply(a);
    }
}




public class Member{
    //Your implementation here
    private static final long SerialVersionUID = 1;

    private String id;
    ArrayList<Member> members;

    public static String serialHelper(Member member, String helper){
        helper = helper + member.toBinary();
        Iterator<? extends Member> currentMember= member.members.next;
        while currentMember.hasNext(){
            helper = Member.serialHelper(currentMember, helper);
            currentMember = currentMember.next();
        }
        return helper;
    }
    public static String serialize(Member member){
        return serialHelper(member, "");
    }

    public String toBinary() {
        // does serilization, no need to implement.
    }
}
