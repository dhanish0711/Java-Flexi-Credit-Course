/**
 * Derived class representing a Graduate Student.
 * Inherits from Student and adds specialization details.
 */
public class GraduateStudent extends Student {
    private String specialization;
    private String thesisTitle;
    private String advisor;

    // Default constructor
    public GraduateStudent() {
        super();
        this.specialization = "Undeclared";
        this.thesisTitle = "N/A";
        this.advisor = "N/A";
    }

    // Parameterized constructor
    public GraduateStudent(String name, int age, int rollNumber, double marks,
                           String specialization, String thesisTitle, String advisor) {
        super(name, age, rollNumber, marks);  // Call parent constructor
        this.specialization = specialization;
        this.thesisTitle = thesisTitle;
        this.advisor = advisor;
    }

    // Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    // Override displayInfo to include graduate-specific details
    @Override
    public void displayInfo() {
        System.out.println("--- Graduate Student Details ---");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Grade          : " + getGrade());
        System.out.println("Specialization : " + specialization);
        System.out.println("Thesis Title   : " + thesisTitle);
        System.out.println("Advisor        : " + advisor);
    }
}
