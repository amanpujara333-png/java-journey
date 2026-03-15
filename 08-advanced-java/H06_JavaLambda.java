// File: H06_JavaLambda.java
// Class Name: H06_JavaLambda
// Purpose: Demonstrates use of Java Lambda expressions

import java.util.*;

public class H06_JavaLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Rahul", "Sita");

        // Using lambda to print names
        names.forEach(name -> System.out.println("Hello " + name));

        // Sorting using lambda
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted Names Desc: " + names);
    }
}