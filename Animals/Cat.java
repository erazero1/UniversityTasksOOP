package OOP.Animals;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    void eat() {
        System.out.println("Кошка ест " + food);
    }
}
