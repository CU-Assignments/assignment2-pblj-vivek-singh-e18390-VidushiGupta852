import java.util.Scanner;

// Abstract base class
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented in derived classes
    public abstract void displayDetails();
}

// Derived class: Student
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = new Student(studentName, studentAge, rollNumber);

        // Input for Teacher
        System.out.println("\nEnter Teacher Details:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAge, subject);

        // Display details
        student.displayDetails();
        teacher.displayDetails();

        scanner.close();
    }
}


