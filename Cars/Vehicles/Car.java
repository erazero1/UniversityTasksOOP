package OOP.Cars.Vehicles;

import OOP.Cars.Details.Engine;
import OOP.Cars.Professions.Driver;

public class Car {
    private String Brand;
    private String Class;
    private int weight;
    Driver driver;
    Engine motor;

    void start(){
        System.out.println("Let's go");
    }

    void stop(){
        System.out.println("Let's stop");
    }

    void turnRight(){
        System.out.println("Turn right");
    }

    void turnLeft(){
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car: {\n" +
                "Brand: " + Brand + "\n" +
                "Class: " + Class + "\n" +
                "Weight: " + weight + "\n}" + motor.toString() + " \n" +
                driver.toString();
    }
}
