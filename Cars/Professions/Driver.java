package OOP.Cars.Professions;

public class Driver extends Person{
    private String fullName;
    private int experience;

    public int getExperience() {
        return experience;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Driver: {\n" +
                "Name: " + fullName + "\n" +
                "Experience: " + experience + "\n}";
    }
}
