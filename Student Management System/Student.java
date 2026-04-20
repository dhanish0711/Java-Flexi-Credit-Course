/**
 * Derived class representing a Student.
 * Inherits from Person and adds roll number and marks.
 */
public class Student extends Person {
    protected int rollNumber;
    protected double marks;

    // Default constructor
    public Student() {
        super();
        this.rollNumber = 0;
        this.marks = 0.0;
    }

    // Parameterized constructor
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);  // Call parent constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getters and Setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Calculate grade based on marks
    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Override displayInfo to include student-specific details
    @Override
    public void displayInfo() {
        System.out.println("--- Student Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + getGrade());
    }
}
