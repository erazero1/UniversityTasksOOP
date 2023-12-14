package OOP.Animals;

public class Horse extends Animal {
    private String height;

    public Horse(String food, String location, String height) {
        super(food, location);
        this.height = height;
    }

    @Override
    void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    void eat() {
        System.out.println("Лошадь ест " + food);
    }
}
