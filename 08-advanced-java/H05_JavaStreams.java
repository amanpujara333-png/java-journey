// File: H05_JavaStreams.java
// Class Name: H05_JavaStreams
// Purpose: Demonstrates use of Java Streams API for filtering and mapping

import java.util.*;
import java.util.stream.*;

public class H05_JavaStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Filter even numbers and print
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Map numbers to their squares
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
    }
}