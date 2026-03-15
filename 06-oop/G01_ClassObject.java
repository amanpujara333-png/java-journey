// File: G01_ClassObject.java
// Purpose: Demonstrates classes and objects

public class G01_ClassObject {
    String name;
    int age;

    public G01_ClassObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        G01_ClassObject obj = new G01_ClassObject("Aman", 23);
        obj.display();
    }
}