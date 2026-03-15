// File: H02_FileHandling.java
// Class Name: H02_FileHandling
// Purpose: Demonstrates basic file reading and writing in Java

import java.io.*;

public class H02_FileHandling {
    public static void main(String[] args) {
        try {
            // Write to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello Java File Handling!");
            writer.close();

            // Read from the file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}