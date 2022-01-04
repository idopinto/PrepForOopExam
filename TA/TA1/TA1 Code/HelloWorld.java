

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World"); // print line function

        for(int i=0; i<10; i++){
            System.out.println(i); // print 0 to 9 for loop
        }

        if(1 < 100){
            System.out.println("duh");
        }
        else
        {
            System.out.println("never going to print this...");
        }

        int x = 0;
        int y;

        foo();
        int[] arr1 = {1,2,3};  // array declaration
        int arr2[] = {4,5,6};  // another array declaration
        int[] arr3 = new int[3]; //another way to initialize, also note arrays are static and can't grow.
        for(int i: arr1){
            System.out.println(i);
        }
        for(var i: arr2){ //var is like auto in C++ but it can only work on local variables!
            System.out.println(i);
        }

        for(var i: arr3){
            System.out.println(i); //arr3 has default value which is 0
        }
        System.out.println("length of arr1 is " + arr1.length);
        // arrays are objects and have a length member
        A a = new A(); // a is a reference to an object of type A.
        // "a" is on the stack while the object itself is on the heap
        a = null; // the object is now freed by the garbage collector and the reference a points to null.

    }

    public static void foo(){
        System.out.println("Foo");
    }
    
}

class A{}
