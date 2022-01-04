package singleton_pattern;


import java.util.ArrayList;
import java.util.List;

// reference: https://www.programiz.com/java-programming/singleton retrieved 2021-11-27
// http://w3sdesign.com/?gr=b08&ugr=proble#gf
class Singleton {

    private static List<String> data;

    // private field that refers to the object
    private static final Singleton singleObject = new Singleton();

    private Singleton() {   //
        // constructor of the SingletonExample class
        this.data = new ArrayList<>();
    }

    public static List<String> getData(){
        return data;
    }

    public static Singleton getInstance() {
        // write code that allows us to create only one object
        // access the object as per our need
        return singleObject;
    }
}