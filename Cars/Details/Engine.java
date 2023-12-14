package OOP.Cars.Details;

public class Engine {
    private int power;
    private String manufacturer;

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Engine: {\n" +
                "Power: " + power + "\n" +
                "Manufacturer: " + manufacturer + "\n}";
    }
}
