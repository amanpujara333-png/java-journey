// File: G06_InterfaceExample.java
// Purpose: Demonstrates interface

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class G06_InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}