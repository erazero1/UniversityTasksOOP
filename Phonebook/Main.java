package OOP.Phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("1. Add contact\n" +
                    "2. Show all contacts\n" +
                    "3. Find contact\n" +
                    "4. Remove contact\n" +
                    "5. Edit contact\n" +
                    "6. Exit");
            int choose = scan.nextInt();
            String name;
            int amount;

            switch (choose) {
                case 1:
                    System.out.println("Name:");
                    name = scan.next();
                    System.out.println("The amount of numbers:");
                    amount = scan.nextInt();
                    System.out.println("The number:");
                    ArrayList<String> numbers = new ArrayList<>();
                    for (int i = 0; i < amount; i++) {
                        numbers.add(scan.next());
                    }
                    Person p = new Person(name, numbers);
                    phoneBook.add(p);
                    break;
                case 2:
                    System.out.println(phoneBook.showAll());
                    break;
                case 3:
                    System.out.println("The name or part of the name of the contact:");
                    String substr = scan.next();
                    System.out.println(phoneBook.find(substr));
                    break;
                case 4:
                    System.out.println("The name of the contact:");
                    name = scan.next();
                    phoneBook.remove(name);
                    break;
                case 5:
                    System.out.println("The name of the contact:");
                    name = scan.next();
                    System.out.println(phoneBook.find(name));
                    if (phoneBook.find(name) != null) {
                        System.out.println("What you want to edit?(1.Name, 2.Number)");
                        int chooseEdit = scan.nextInt();
                        if (chooseEdit == 1) {
                            System.out.println("Enter the name of the contact:");
                            name = scan.next();
                            System.out.println("Enter the new name:");
                            String newName = scan.next();
                            phoneBook.editName(name, newName);
                        } else if (chooseEdit == 2) {
                            System.out.println("Enter the number of the contact:");
                            String number = scan.next();
                            System.out.println("Enter the new number:");
                            String newNumber = scan.next();
                            phoneBook.editNumber(number, newNumber);
                        }

                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                default:
                    return;
            }


        }
    }
}
