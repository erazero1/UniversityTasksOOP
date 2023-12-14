package OOP.Students;

public class Aspirant extends Student{

    private String scientificWork;


    public Aspirant() {}

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    int getScholarship() {
        if(averageMark == 5){
            return 200;
        }
        return 180;
    }
}
