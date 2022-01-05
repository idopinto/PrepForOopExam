import java.util.HashMap;
import java.util.List;

public class SmallQs {

    public static void main(String[] args) {
        HashMap<Person, Integer> personMap = new HashMap<>();
    }

    class Person {
        final String id;
        Person(String id){
            this.id = id;
        }

        @Override
        public boolean equals(Object o){
            if(!(o instanceof Person) || o==null) return false;
            Person other = (Person) o;
            return this.id.equals(other.id);
        }

        @Override
        public int hashCode(){
            return this.id.hashCode();
        }
    }

    class Bird {
        public void fly(){
            System.out.println("I believe I can fly");
        } 
    }

    class BirdDecorator extends Bird{
        Bird bird;
        BirdDecorator(Bird bird) {
            this.bird = bird;
        }

        @Override
        public void fly(){
            // decoration
            bird.fly();
            // decoration
        }
    }

    // a singleton is a design pattern where only one instance of a class can be created
    class Singleton {
        private final static Singleton singleton = new Singleton();

        private Singleton(){

        }

        public static Singleton getInstance(){
            return singleton;
        }
    }

    // serilization in java is the process of turning objects into streams. File streams are a common example.
    // java serilization has access to private fields. This is done via Reflection.

    public class GeneralClass
    {
        class Animal {
            
        }
        class Monkey extends Animal{
            
        }
        
        /*
        Write your BeastMaster class under this comment (question 1)
        */ 

        class BeastMaster<T extends Animal> {
            T animal;
        }
        
        /*
        Write your answer to question 2 under this comment
        */

        // the code is not valid due to invariance.
        
        /*
        Write the member for question 3 under this comment
        */
        List<BeastMaster<? extends Monkey>> monkeys;
    }   

    // Regex
    // [] capture single letters.
    // () are used to both encapsulate and group expressions.
    // the expression will capture ab since the ? after the * marks it as reluctant.

    // a) Erasure in jave is the process where all generic references are removed, and are instead turned into Object
    // if unbound or to the bound if the generic is bounded.
    // b) LinkedList<int> impossible, T[], new T(), instance of T, LinkedList<Integer>[] array

    //
}