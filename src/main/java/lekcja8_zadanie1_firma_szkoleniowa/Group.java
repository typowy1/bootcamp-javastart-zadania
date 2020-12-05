package lekcja8_zadanie1_firma_szkoleniowa;

public class Group {

    private String name;
    private Teacher teachers;
    private Student[] students;

    public Group(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teachers = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }
}
