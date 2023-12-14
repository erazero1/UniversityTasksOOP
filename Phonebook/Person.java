package OOP.Phonebook;


import java.util.ArrayList;

public class Person {
    private ArrayList<String> numbers;
    private String name;


    @Override
    public String toString() {
        return "Name: " + name + ", numbers:" + numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return name.equals(that.name) ||
                numbers.equals(that.numbers);
    }

    public Person(String name, ArrayList<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNumbers(String number) {
        this.numbers.add(number);
    }
}
