package OOP.Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    void eat() {
        System.out.println("Собака ест " + food);
    }
}
