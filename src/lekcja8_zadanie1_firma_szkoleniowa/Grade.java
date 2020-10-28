package lekcja8_zadanie1_firma_szkoleniowa;

public class Grade {

    private int value;
    private Group group;

    public Grade(int value, Group group) {
        this.value = value;
        this.group = group;
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

    public String getInfo() {
        return value + group.getName();
    }
}
