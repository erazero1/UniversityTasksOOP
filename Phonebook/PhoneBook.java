package OOP.Phonebook;

import java.util.ArrayList;

public class PhoneBook {
    private final ArrayList<Person> contacts = new ArrayList<>();

    public void add(Person p) {
        if(contacts.contains(p)){
            System.out.println("This contact already exists.");
            return;
        }
        contacts.add(p);
        System.out.println("Contact successfully added.");
    }

    public String showAll() {
        String result = "";
        for (Person p : contacts) {
            result += p.toString() + "\n";
        }
        return result;
    }

    public String find(String searchPhrase) {
        String result = "";
        for (Person p : contacts) {
            if (p.getName().contains(searchPhrase)) {
                result += p.toString() + "\n";
            }
        }
        return result;
    }

    public void remove(String name) {
        for (Person p : contacts) {
            if (p.getName().equals(name)) {
                contacts.remove(p);
                System.out.println("The contact successfully removed");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void editName(String name, String newName) {
        for (Person p : contacts) {
            if (p.getName().contains(name)) {
                p.setName(newName);
            }
        }
        System.out.println("Name successfully edited");
    }

    public void editNumber(String number, String newNumber) {
        for (Person p : contacts) {
            if (p.getNumbers().contains(number)) {
                p.getNumbers().remove(number);
                p.addNumbers(newNumber);
            }
        }
        System.out.println("Number successfully edited");
    }
}