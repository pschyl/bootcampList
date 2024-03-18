public class Course {

    private String name;
    private String instructor;
    private String room;

    public Course(String name, String instructor, String room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    public Course() {}

    @Override
    public String toString() {
        return name + "-" + instructor + "-" + room;
    }
}
