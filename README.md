# PrepForOopExam
Hello everyone! 
 
I assume that you're currently studying for your OOP exam and you are probably tired from exerice 5 ,

don't know how or from where to get all the needed information.

ME TOO! 

so that's why I thought it can be good idea to create this repo and let EVERYONE share his/her favorite youtube playlist, website or any useful OOP related content.

The rules are simple:

1.

2.

3. Enjoy

Feel free to contribute! 💻



# Index
1.[Basic Java syntax](#Basic-Java-Syntax)
   - Data Types
   - Declaring Variables in Java
   - Arrays
   - Java Keywords (static,final etc.)
   - Operators in Java
     - Arithmetic Operators
     - Logical Operators
     - Comparison Operators
   - Java Program Structure
   - Visibility Modifiers
   - Enum
   - Useful libraries
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
6. [Exceptions](#Exceptions)
7. [Java collections](#Java-collections)
8. [Design Patterns](#Design-Patterns)
    - Factory
    - Decorator
    - Iterator
    - Strategy
    - Singleton
    - Observer
    - State
    - Facade
    - Dependecy Injection
    - Memento
9. [Generics](#Generics)
    - Wildcard
    - Erasure
10. [Functional Programming](#Functional-Programming)
    - Local and Anonymous Classes
    - Lambdas
    - Functional Interfaces
    - Java.util.functions
    - Closures
    - Callbacks
11. [Algorithms](#Algorithms)
    - Dynamic Programming
    - Greedy algorithms
12. [UML](#UML)
13. [Advanced topics in Java](#Advanced-topics-in-java)
    - Serialization
    - Reflection
    - Copy Constructor
    - Clone
    - Frameworks (Spring)
14. [Regex](#Regex)

# Basic Java Syntax
```
function test() {
  console.log("notice the blank line before this function?");
}
```

# Basic Compilation process in Java

# Basic OOP terminology
## Object, Class, Instance, Attributes
   - [Object](https://www.geeksforgeeks.org/classes-objects-java/) is a basic unit of Object-Oriented Programming and represents the real life entities.
   - 
   - [Class](https://www.geeksforgeeks.org/classes-objects-java/)
   - 
   [Classes & Objects | Java | Mike Dane](https://www.youtube.com/watch?v=Mm06BuD3PlY)



# Basic OOP principles

# Exceptions

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

# Generics

# Functional Programming

# Algorithms

## MinSumPath LeetCode question
```
public class MinSumPath {

    /***
     * Given a grid of integers of size N x M finds the minimal sum of the path from the upper left corner
     * (0,0) to the bottom right corner (N-1, M-1)
     * @param grid
     * @return minimal sum of said path
     */
    public static int CalculateMinSumPath(int[][] grid){
        /* Implement here */
        
    }
}
```
[LeetCode Reference](https://leetcode.com/problems/minimum-path-sum/)
[Explanation](https://www.youtube.com/watch?v=t1shZ8_s6jc)

## Unique morse code words
```
/**
 * Given list of words this function returns how many unique code morse is in the list.
 * note. if two words are translated equally then their code will count once.
 * this algorithm should run in O(S) time - complexity when S = the sum of the length of each word in the list.
 * @param words Array of strings
 * @return # of unique code morse in words.
 */
public static int buildUniqueMorseCodeTable(String[] words, String[] morseSet) {
        /* Implement here */

}
```
[LeetCode Reference](https://leetcode.com/problems/unique-morse-code-words/)
[Explanation](https://www.youtube.com/watch?v=ZF7KWiYsI6I)
```
 // note that there is a duplicate iff there is cycle in the path created by
 // numList[0] -> numList[numList[0]] -> numList[numList[numList[0]]] -> ...
 // and if cycle does indeed exit then the duplicate is the first number that created the cycle.
 // the reason for that is that we refer to the array values as pointers to the array's indexes, so if x is a
 // duplicate then multiply nodes in the graph point to x.
 // the strategy is as follows:
 // 1. find the cycle -> 2. find the first number that created the cycle -> 3.return this number.
 ```
 ## Find duplicate

```
/*
* Finds and returns duplicate value in integer array of size n+1 .
* which holds values from 1-n.
* assuming there is one duplicate and can appear more than once.
*/
public static int findDuplicate(int[] numList) {
// case there is no duplicate is the number list length is 0 or 1
if (numList.length <= 1) {return -1;}

int regularPointer = numList[0];
int superPointer = numList[numList[0]];

while (superPointer != regularPointer) {
regularPointer = numList[regularPointer];
superPointer = numList[numList[superPointer]];
}

 while (superPointer != regularPointer) {
 regularPointer = numList[regularPointer];
 superPointer = numList[superPointer];
 }
 return regularPointer;
 }

}
```
[LeetCode Reference](https://leetcode.com/problems/find-the-duplicate-number/)
[Explanation](https://www.youtube.com/watch?v=wjYnzkAhcNk)

# UML

# Advanced topics in Java

# Regex

