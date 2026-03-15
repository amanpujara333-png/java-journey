// File: G03_Polymorphism.java
// Purpose: Demonstrates polymorphism

public class G03_Polymorphism {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        G03_Polymorphism obj = new G03_Polymorphism();
        obj.show(10);
        obj.show("Hello");
    }
}