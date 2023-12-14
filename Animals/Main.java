package OOP.Animals;

public class Main {
    public static void main(String[] args) {
        Veterinary veterinary = new Veterinary();
        Animal cat = new Cat("Мышь", "Дом", "Чёрный");
        Animal dog = new Dog("Кость", "Улица", "Коричневый");
        Animal horse = new Horse("Сено", "Конюшня", "1.50m");
        Animal[] animals = new Animal[]{cat, dog, horse};
        for (Animal a: animals) {
            veterinary.treatAnimal(a);
        }
    }
}
