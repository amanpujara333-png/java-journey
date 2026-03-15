// File: G02_Inheritance.java
// Purpose: Demonstrates inheritance

class Parent {
    void greet() {
        System.out.println("Hello from Parent!");
    }
}

public class G02_Inheritance extends Parent {
    public static void main(String[] args) {
        G02_Inheritance obj = new G02_Inheritance();
        obj.greet();
    }
}