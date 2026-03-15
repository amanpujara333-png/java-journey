// File: 05_UserInput.java
// Class Name: B05_UserInput
// Purpose: Demonstrates how to take user input using Scanner class

import java.util.Scanner;

public class B05_UserInput {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read a full line

        // Display the input
        System.out.println("Hello, " + name + "!");

        // Close the Scanner object
        sc.close();
    }
}