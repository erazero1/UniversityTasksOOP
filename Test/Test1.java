package OOP.Test;

public class Test1 {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("+77075403527", "A30");
        Phone p3 = new Phone("+77085403527", "S20", 500);
        System.out.println(p1.number + " " + p1.model + " " + p1.weight);
        p1.receiveCall("Mike");
        System.out.println(p2.number + " " + p2.model + " " + p2.weight);
        p2.receiveCall("Bob");
        System.out.println(p3.number + " " + p3.model + " " + p3.weight);
        p3.receiveCall("Jane", "3948390428");
        String[] numbers = new String[]{"21491248", "23984324", "349839483"};
        p1.sendMessage(numbers, "Hello");
    }
}

