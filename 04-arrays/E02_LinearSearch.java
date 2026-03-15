// File: E02_LinearSearch.java
// Class Name: E02_LinearSearch
// Purpose: Implements linear search to find an element in an array

import java.util.Scanner;

public class E02_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        sc.close();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!found) System.out.println("Element not found.");
    }
}