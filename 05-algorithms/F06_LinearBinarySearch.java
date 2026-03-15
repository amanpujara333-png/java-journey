// File: F06_LinearBinarySearch.java
// Purpose: Demonstrates linear and binary search

import java.util.Arrays;

public class F06_LinearBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};

        // Linear Search
        int target = 10;
        int linearIndex = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) linearIndex = i;
        System.out.println("Linear search index: " + linearIndex);

        // Binary Search (array must be sorted)
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        int binaryIndex = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == target) { binaryIndex = mid; break; }
            if (arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        System.out.println("Binary search index: " + binaryIndex);
    }
}