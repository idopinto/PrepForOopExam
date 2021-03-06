# PrepForOopExam
Hello everyone! 
 
I assume that you're currently studying for your OOP exam and you are probably tired from exercise 5 , don't know how or from where to get all the needed information.

ME TOO! 

So that's why I thought it can be a good idea to create this repo and let EVERYONE share his/her favorite youtube playlist, website or any useful OOP related content.

Feel free to contribute! 💻

### [Exams](https://github.com/idopinto/PrepForOopExam/tree/main/Exams)
### [TA](https://github.com/idopinto/PrepForOopExam/tree/main/TA)
### [Course Drive](https://drive.google.com/drive/folders/0B4NFaiXelmmkZG1LQkdmbHRya3M?resourcekey=0-uAF0XJ4UAeP6GAogU_HX1A)
### [Summary](https://github.com/idopinto/PrepForOopExam/tree/main/Notes)
### [Campus.il Course website (Hebrew)](https://courses.campus.gov.il/courses/course-v1:HUJI+ACD_RFP4_HUJI_OOP+2019_1/info)
# Index
1. [Basic Java syntax](#Basic-Java-Syntax)
   - Data Types
   - Declaring Variables in Java
   - Arrays
   - Java Keywords (static,final etc.)
   - Operators in Java
   - Visibility Modifiers
   - Enum
   - String
   - Packages
   - Modules
2. [Basic Compilation process in Java](#Basic-Compilation-process-in-Java)
   - JVM 
3. [Basic OOP terminology](#Basic-OOP-terminology)
   - information hiding
   - Minimal API
   - encapsulation
   - Abstraction
   - Polymorphism
   - Inheritance
   - Composition
   - Interfaces
   - Abstract class
4. [Basic OOP principles](#Basic-OOP-principles)
   - Program to interface not implementation principle
   - The single choice Principle
   - Modularity principle
   - Open-Closed prinicple
   - Leskov substituion principle
5. [Algorithms](#Algorithms)
6. [Exceptions](#Exceptions)
7. [Java collections](#Java-collections)
8. [Design Patterns](#Design-Patterns)
9. [Generics](#Generics)
10. [Functional Programming](#Functional-Programming)
    - Local and Anonymous Classes
    - Lambdas
    - Functional Interfaces
    - Java.util.functions
    - Closures
    - Callbacks
11. [UML](#UML)
12. [Advanced topics in Java](#Advanced-topics-in-java)
    - Serialization
    - Reflection
    - Copy Constructor
    - Clone
    - Frameworks (Spring)
13. [Regex](#Regex)

# Basic Java Syntax

  ## **Java Keywords**
  1. **null**
   
     ```
     Bike example = null; // no object created here and example points to nothing
     ```
     ```
     example.gear; //  accessing null object attributes leads to runtime errors
     // NullPointerException
     ```
     ```
     Bike example; // By default example value is null
     ```
     
  ## **Visibility Modifiers**
   
   In Java, methods and data members of a class/interface can have one of the  
    
   following four access specifiers. 
    
   1. private (accessible within the class where defined)
   2. default or package private (when no access specifier is specified)
   3. protected 
   4. public (accessible from any class)

   But, the classes and interfaces themselves can have only two access specifiers
   
   when declared outside any other class.
   
   1. public
   2. default (when no access specifier is specified)
     
   **Note** : Nested interfaces and classes can have all access specifiers.
   
      ## [String Class](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
   The most common java class.
   Altough it is no a primitive, can be initialized using the '=' sign.
   ```
   String myString = "hello"; // legal, just like writing new String("hello")
   ```
   String class has many important useful methods!  you can read more [HERE](https://stackabuse.com/common-string-operations-in-java/) about them.
   String class is [immutable](https://www.youtube.com/watch?v=qbNMAJvv7qI) meaning we can't change the content of string.
 
🔼[Back To Top](#Index)

# Basic Compilation process in Java
### [JVM vs JRE vs JDK](https://www.youtube.com/watch?v=RYd_hagCiVk)
### [compilation process](https://www.geeksforgeeks.org/compilation-execution-java-program/)
🔼[Back To Top](#Index)

# Basic OOP terminology
## Object, Class, Instance, Attributes
   - [Object](https://www.geeksforgeeks.org/classes-objects-java/) is a basic unit of Object-Oriented Programming and represents the real life entities.
   - [Class](https://www.geeksforgeeks.org/classes-objects-java/)

## Abstract class
![alt text](https://static.javatpoint.com/images/abstract-class-in-java.jpg)

[Abstract class](https://www.javatpoint.com/abstract-class-in-java)

   
🔼[Back To Top](#Index)

# Basic OOP principles
 ### [ALL-IN-ONE](https://java-design-patterns.com/principles/#openclosed-principle) all the OOP prinicples we've learned and more!    
   ### [SOLID](https://en.wikipedia.org/wiki/SOLID)
   - [**The Single Responsibility Principle**](https://www.youtube.com/watch?v=DAD2oMWDWNc)
  
       A class should never have more than one reason to change.
       
      every class should have only one responsibility!
      
      and that responsibility should be entirely encapsulated by the class.
      
      Responsibility can be defined as a reason to change, so a class or module should have one, and only one, reason to change.

      **Why?** Maintainability: changes should be necessary only in one module or class.
      
      **How?** Apply Curly's Law which means choosing a single, clearly defined goal for any particular bit of code: Do One Thing.
   
   - **The Open-Closed prinicple**
   
     Software entities should be open for extension, but closed for modification
     i.e. such an entity can allow its behavior to be modified without altering its source code.
     
     **Why?**  Improve maintainability and stability by minimizing changes to existing code.
       
     **How?** Write classes that can be extended (as opposed to classes that can be modified).
     
     Expose only the moving parts that need to change, hide everything else.
 
  - [**The Leskov substituion principle**](https://www.youtube.com/watch?v=Orhu0x5aplI) 
    Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
  - [**Modularity principle**](https://www.youtube.com/watch?v=20JP8w6_nVA)
  
   #### [Program to interface not implementation principle](https://www.youtube.com/watch?v=F2DgzoIcufU)


🔼[Back To Top](#Index)

# Exceptions


🔼[Back To Top](#Index)

# Java collections

![alt text](https://i.stack.imgur.com/NaqeR.png)

![alt text](https://i.stack.imgur.com/sHrJK.png)

- [The Collection FrameWork](https://www.youtube.com/watch?v=pbOd_GDDnQk&feature=emb_title)
- [Java Collection Overview article](https://www.javadevjournal.com/java/java-collections/)
- [Java Collection Playlist tutorial](https://youtu.be/oMVRE-U6TTc)

 I'll leave here Javadoc links for every important data structure.
 - [Interface Map<K,V>](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) is an object that maps keys to values, no duplicates and each key can map to at most one value. 
   - [HashMap<K,V>](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) is a Hash table based implementation of the Map interface.
   
 - [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) is an ordered collection (also known as a sequence).
 
   - [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) is a Resizable-array implementation of the List interface.
 
 - [Set](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html) is a collection that contains no duplicate elements. 
   - [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html) implements the Set interface, backed by a hash table (actually a HashMap instance). 
   
 - [Time Complexsity table](https://gist.github.com/psayre23/c30a821239f4818b0709)


# Design Patterns
[ALL-IN-ONE](https://java-design-patterns.com/patterns/) awesome website for diving into design patterns!

[Ohad Klein Design patterns](https://github.com/idopinto/PrepForOopExam/tree/main/Design%20Patterns) Recommended 👑

  ### [Factory](https://java-design-patterns.com/patterns/factory/)
   [Dan Nirel - Factory](https://www.youtube.com/watch?time_continue=280&v=5xuoWMMr_mo&feature=emb_title)
  
  ### [Decorator](https://java-design-patterns.com/patterns/decorator/) 
   [Derek Banas - Decorator](https://www.youtube.com/watch?v=j40kRwSm4VE)
  
  ### [Iterator](https://java-design-patterns.com/patterns/iterator/)
   [Derek Banas - Iterator](https://www.youtube.com/watch?v=VKIzUuMdmag&list=PLF206E906175C7E07&index=17)

  ### [Strategy](https://java-design-patterns.com/patterns/strategy/)
   [Derek Banas - Strategy](https://www.youtube.com/watch?v=j40kRwSm4VE)

  ### [Singleton](https://java-design-patterns.com/patterns/singleton/)
  [Derek Banas - Singleton](https://www.youtube.com/watch?v=NZaXM67fxbs&list=PLF206E906175C7E07&index=7)

  ### [Observer](https://java-design-patterns.com/patterns/observer/)
   [Derek Banas - Observer](https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4)
   [How The Observer Pattern Works](https://www.youtube.com/watch?v=WRkw0l72BL4)

  ### [State](https://java-design-patterns.com/patterns/state/)

   [Derek Banas - State](https://www.youtube.com/watch?v=MGEx35FjBuo&list=PLF206E906175C7E07&index=20)

  ### [Memento](https://java-design-patterns.com/patterns/memento/)
   [Derek Banas - Memento](https://www.youtube.com/watch?v=jOnxYT8Iaoo&list=PLF206E906175C7E07&index=25)

  ### [Facade](https://java-design-patterns.com/patterns/facade/) 
   [Derek Banas - Facade](https://www.youtube.com/watch?v=B1Y8fcYrz5o&list=PLF206E906175C7E07&index=14)
  
  ### [Dependecy Injection](https://java-design-patterns.com/patterns/dependency-injection/)
   [DI pattern](https://www.youtube.com/watch?v=tW6UHD81SG0)
  
🔼[Back To Top](#Index)

# Generics

🔼[Back To Top](#Index)

# Functional Programming

🔼[Back To Top](#Index)

# Algorithms 
  [Source Code by Omri Wolf](https://github.com/idopinto/PrepForOopExam/blob/main/Exam%20Algorithms/Solutions.java)
## MinSumPath
```
 /***
     * Given a grid of integers of size N x M finds the minimal sum of the path from the upper left corner
     * (0,0) to the bottom right corner (N-1, M-1)
     * @param grid - assuming nut NULL.
     * @return minimal sum of said path
     */
    public static int CalculateMinSumPath(int[][] grid){
        // this solution uses the same grid as the DP array. You can also create a new grid and fill it.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // if i = j = 0 do nothing.
                if (i == 0 && j != 0)
                    grid[i][j] += grid[i][j - 1];
                else if (i != 0 && j == 0)
                    grid[i][j] += grid[i - 1][0];
                else if (i != 0 && j != 0)
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        // return grid[n-1, m-1]
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
```
[LeetCode Reference](https://leetcode.com/problems/minimum-path-sum/)

[Explanation](https://www.youtube.com/watch?v=t1shZ8_s6jc)

## Unique morse code words
```
  // all characters' morse code representation, a to z.
    private static final String[] MORSE_CODES = {".-", "-...", "-.-.", "-..",".", "..-.","--.","....","..",".---",
            "-.-", ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    /**
     * find amount of unique morse code translations can be extracted from a list of words.
     * @param words array of strings
     * @return amount of unique morse codes.
     */
    public static int uniqueMorseRepresentations(String[] words) {
        // initialize hashSet for the morse translations.
        Set<String> uniqueMorse = new HashSet<>();
        for (String word : words) {
            // build string one char at a time.
            StringBuilder morse = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                // translate character to morse using the MORSE_CODE array.
                char c = word.charAt(i);
                morse.append(MORSE_CODES[c - 'a']);
            }
            // add the translation to hashSet.
            uniqueMorse.add(morse.toString());
        }
        // size of set is number of unique morse codes.
        return uniqueMorse.size();
    }
```
[LeetCode Reference](https://leetcode.com/problems/unique-morse-code-words/)

[Explanation](https://www.youtube.com/watch?v=ZF7KWiYsI6I)

 ## Find duplicate

```
   /**
     * method finds a duplicate number in an array of N+1 ints, where numbers are in range 1->N.
     * It is important that all numbers are positive.
     * @param numList a list of N+1 numbers in range 1->N.
     * @return the duplicate number.
     */
    public static int findDuplicate(int[] numList) {
        // create 2 pointers on the array
        int i = numList[0];
        int j = numList[0];
        // iterate over the array as a "hashcode", each value is the hashcode for the next index.
        // i jumps 1 time, j jumps twice. stop when they meet (a cycle has been closed).
        do {
            i = numList[i];
            j = numList[numList[j]];
        } while (i != j);
        // find the originator of the cycle. use two pointers, one of the start and one of the end of the cycle.
        // each time jump 1 index, and stop when we get to the duplicate.
        int numCandidate1 = numList[0];
        int numCandidate2 = i;
        while (numCandidate1 != numCandidate2) {
            numCandidate1 = numList[numCandidate1];
            numCandidate2 = numList[numCandidate2];
        }
        return numCandidate2;
    }

```
[LeetCode Reference](https://leetcode.com/problems/find-the-duplicate-number/)

[Explanation](https://www.youtube.com/watch?v=wjYnzkAhcNk)

🔼[Back To Top](#Index)

# UML

🔼[Back To Top](#Index)

# Advanced topics in Java

🔼[Back To Top](#Index)

# Regex

[RegexOne](https://regexone.com/) - A number of short and precise regex problems. General and not specifc to java.

[Regex101](https://regex101.com/) - A regex playground that supports java with problems to solve using regex.

🔼[Back To Top](#Index)

