// File: H03_CollectionsExample.java
// Class Name: H03_CollectionsExample
// Purpose: Demonstrates basic use of Java Collections (ArrayList, HashMap)

import java.util.*;

public class H03_CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits List: " + fruits);

        // HashMap example
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Aman", 25);
        ages.put("Rahul", 30);
        System.out.println("Ages Map: " + ages);
    }
}