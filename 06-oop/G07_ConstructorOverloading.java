// File: G07_ConstructorOverloading.java
// Purpose: Demonstrates constructor overloading

public class G07_ConstructorOverloading {
    int a, b;

    G07_ConstructorOverloading() {
        a = 0;
        b = 0;
    }

    G07_ConstructorOverloading(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        G07_ConstructorOverloading obj1 = new G07_ConstructorOverloading();
        G07_ConstructorOverloading obj2 = new G07_ConstructorOverloading(5, 10);

        obj1.display();
        obj2.display();
    }
}