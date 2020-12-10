package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class Grade {
    // łączy studenta, ocene, grupe
    private Student student; // dany student
    private Group groups; // grupa do której student należy
    private int grade; // ocena danego studenta w tej grupie

    public Grade(Student student, Group groups, int value) {
        this.student = student;
        this.groups = groups;
        this.grade = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
