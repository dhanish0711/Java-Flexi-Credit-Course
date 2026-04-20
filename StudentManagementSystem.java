import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class to demonstrate the Student Management System.
 * Demonstrates inheritance by creating Person, Student, and GraduateStudent objects.
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("==========================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM");
        System.out.println("   (Demonstrating Inheritance in Java)");
        System.out.println("==========================================\n");

        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add a Person");
            System.out.println("2. Add a Student");
            System.out.println("3. Add a Graduate Student");
            System.out.println("4. Display All Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int pAge = scanner.nextInt();
                    scanner.nextLine();

                    Person person = new Person(pName, pAge);
                    people.add(person);
                    System.out.println(">> Person added successfully!\n");
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int sAge = scanner.nextInt();
                    System.out.print("Enter Roll Number: ");
                    int sRoll = scanner.nextInt();
                    System.out.print("Enter Marks: ");
                    double sMarks = scanner.nextDouble();
                    scanner.nextLine();

                    Student student = new Student(sName, sAge, sRoll, sMarks);
                    people.add(student);
                    System.out.println(">> Student added successfully!\n");
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String gName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int gAge = scanner.nextInt();
                    System.out.print("Enter Roll Number: ");
                    int gRoll = scanner.nextInt();
                    System.out.print("Enter Marks: ");
                    double gMarks = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String gSpec = scanner.nextLine();
                    System.out.print("Enter Thesis Title: ");
                    String gThesis = scanner.nextLine();
                    System.out.print("Enter Advisor Name: ");
                    String gAdvisor = scanner.nextLine();

                    GraduateStudent gradStudent = new GraduateStudent(
                            gName, gAge, gRoll, gMarks, gSpec, gThesis, gAdvisor);
                    people.add(gradStudent);
                    System.out.println(">> Graduate Student added successfully!\n");
                    break;

                case 4:
                    if (people.isEmpty()) {
                        System.out.println("\n>> No records found.\n");
                    } else {
                        System.out.println("\n==========================================");
                        System.out.println("         ALL RECORDS (" + people.size() + ")");
                        System.out.println("==========================================");
                        for (int i = 0; i < people.size(); i++) {
                            System.out.println("\nRecord #" + (i + 1));
                            people.get(i).displayInfo();  // Polymorphic call
                        }
                        System.out.println("\n==========================================");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("\n>> Exiting Student Management System. Goodbye!");
                    break;

                default:
                    System.out.println(">> Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
