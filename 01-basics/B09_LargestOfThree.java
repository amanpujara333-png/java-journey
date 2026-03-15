// File: B09_LargestOfThree.java
// Class Name: B09_LargestOfThree
// Purpose: Finds the largest number among three numbers

public class B09_LargestOfThree {
    public static void main(String[] args) {

        int a = 10, b = 25, c = 15;

        int largest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest number is: " + largest);
    }
}