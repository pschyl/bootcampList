import java.util.ArrayList;

public class School {

    static ArrayList<Student> studentsOfSchool = new ArrayList<>();

    public static void addStudent(Student student) {
        studentsOfSchool.add(student);
    }

    public static void printStudents() {
        System.out.println(studentsOfSchool);
    }

    public static ArrayList<Course> getCourses(int id) {
        return studentsOfSchool.get(id).getCourses();
    }

    public static Student findStudent(int id) {
        return studentsOfSchool.get(id);
    }

    public static void deleteStudent(int id) {
        studentsOfSchool.remove(id);
    }

}
