package lekcja8_zadanie1_firma_szkoleniowa;

public class School {
    public static void main(String[] args) {


        Student[] students = new Student[30];
        students[0] = SchoolUtils.enterStudents();
 //       students[1] = SchoolUtils.enterStudents();

        Teacher[] iTTeachers = new Teacher[100];
        iTTeachers[0] = SchoolUtils.enterTeachers();
//        iTTeachers[1] = SchoolUtils.enterTeachers();


         Group programowanie = new Group("Programowanie", iTTeachers[0], students);
 //       Group informatyka = new Group("Informatyka", iTTeachers[1], students);

//        Grade[] grades = new Grade[2];
//        grades[0] = new Grade(5, iT[0]);
//        grades[1] = new Grade(4, iT[1]);
//      SchoolUtils.showGroupInfo(iT[0]);
      SchoolUtils.showGroupInfo(programowanie);

    }
}
