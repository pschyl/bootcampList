import java.util.ArrayList;

public class Student {

    private static int totalStudents = 0;
    private String firstName;
    private String lastName;
    private int studentID;

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentID = totalStudents;
        totalStudents += 1;
    }

    public Student() {};

    public void addCourses(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + studentID;
    }

}
