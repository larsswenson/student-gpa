import java.util.*;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double gpa;

    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Compare students by GPA
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId=" + studentId +
               ", name='" + name + '\'' +
               ", gpa=" + gpa +
               '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Randy", 3.5));
        students.add(new Student(2, "Cynthia", 3.8));
        students.add(new Student(3, "Nico", 3.2));
        students.add(new Student(4, "Gaspar", 3.8));
        students.add(new Student(5, "Pablo", 3.7));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
