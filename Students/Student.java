package OOP.Students;

public class Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(){}

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship(){
        if(averageMark == 5){
            return 100;
        }
        return 80;
    }
}
