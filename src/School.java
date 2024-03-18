import java.util.ArrayList;

public class School {

    private static ArrayList<Student> studentsOfSchool = new ArrayList<>();


    public static void addStudent(Student student) {
        studentsOfSchool.add(student);
    }

    public static void printStudents() {
        System.out.println(studentsOfSchool);
    }

    public static ArrayList<Course> getCourses(int id) {
        Student student = findStudent(id);
        if (student == null) {
            return null;
        }
        return student.getCourses();
    }

    public static Student findStudent(int id) {
        for (Student student:studentsOfSchool) {
            if (student.getStudentID() == id) {
                return student;
            }
        }
        return null;
    }

    public static void deleteStudent(int id) {
        studentsOfSchool.remove(findStudent(id));
    }

}
