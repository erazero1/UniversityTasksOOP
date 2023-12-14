package OOP.Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    void receiveCall(String name){
        System.out.println(name + " is ringing");
    }

    void receiveCall(String name, String number){
        System.out.println(name + " is ringing. Number: " + number);
    }

    void sendMessage(String... number){
        for (String s: number) {
            System.out.println(s + " ");
        }
    }

    String getNumber(){
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}



}
