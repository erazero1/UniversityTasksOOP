package OOP.Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant();
        Student student1 = new Student();
        Aspirant aspirant = new Aspirant();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(aspirant);
        students.add(student1);
        for (Student s: students) {
            System.out.println(s.getScholarship());
        }
    }
}
