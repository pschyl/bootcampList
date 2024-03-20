import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Christian", "Sales");
        Student student2 = new Student("Christian", "Simon");
        Student student3 = new Student("Louis", "Frochaux");

        Course course1 = new Course("Math", "Mrs. Kopp", "A12");
        Course course2 = new Course("Physics", "Mr. Tappelt", "B23");

        //students.add(student1);
        //students.add(student2);

        //School.addStudent(student1);
        //School.addStudent(student2);
        //School.addStudent(student3);

        /*School.printStudents();

        System.out.println(School.findStudent(1));
        School.deleteStudent(1);

        School.printStudents();

        student1.addCourses(course1);
        student1.addCourses(course2);

        System.out.println(School.getCourses(0));
        System.out.println(School.getCourses(1)); */

        HashMap<Integer,Student> newMap = School.listToHashmap();

        System.out.println(newMap);

        System.out.println(newMap.get(2));
        System.out.println(newMap.size());
        newMap.remove(0);
        System.out.println(newMap.containsKey(5));

        System.out.println(newMap);

    }
}