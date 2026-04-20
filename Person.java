/**
 * Base class representing a Person with common attributes.
 * Serves as the root of the inheritance hierarchy.
 */
public class Person {
    protected String name;
    protected int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display person information
    public void displayInfo() {
        System.out.println("--- Person Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
