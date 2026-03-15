// File: G04_Encapsulation.java
// Purpose: Demonstrates encapsulation

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class G04_Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Aman");
        System.out.println("Name: " + p.getName());
    }
}