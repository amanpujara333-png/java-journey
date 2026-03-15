// File: E03_BinarySearch.java
// Class Name: E03_BinarySearch
// Purpose: Implements binary search (array must be sorted)

import java.util.Arrays;
import java.util.Scanner;

public class E03_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        sc.close();

        int index = Arrays.binarySearch(arr, target);
        if (index >= 0) System.out.println("Element found at index " + index);
        else System.out.println("Element not found.");
    }
}