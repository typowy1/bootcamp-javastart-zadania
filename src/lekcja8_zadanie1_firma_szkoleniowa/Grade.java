package lekcja8_zadanie1_firma_szkoleniowa;

public class Grade {

    private int value;
    private Group group;
    private Student student;

    public Grade(int value, Group group, Student student) {
        this.value = value;
        this.group = group;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
