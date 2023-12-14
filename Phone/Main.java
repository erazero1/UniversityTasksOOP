package OOP.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone("+88005553535", "Samsung A23");
        Phone phone2 = new Phone("+87075403527", "Samsung A23", 0.32);
        phone.receiveCall("Erasyl");
        phone1.receiveCall("Roman");
        phone2.receiveCall("Anna");
        phone.receiveCall("Erasyl", "+87075403527");

    }
}
