// File: G05_Abstraction.java
// Purpose: Demonstrates abstraction

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class G05_Abstraction {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.area();
    }
}