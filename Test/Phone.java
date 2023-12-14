package OOP.Test;

public class Phone {
    public Phone(){

    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    void receiveCall(String nameOfCaller){
        System.out.println("Звонит " + nameOfCaller);
    }
    void receiveCall(String nameOfCaller, String numberOfCaller){
        System.out.println("Звонит: " + nameOfCaller + " Номер: " + numberOfCaller);
    }
    public
    void sendMessage(String[] numbers, String msg){
        for (String s : numbers) {
            System.out.println("Sending " + msg + " to " + s);
        }
    }
    String number;
    String model;
    int weight;
}
