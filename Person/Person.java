package OOP.Person;

public class Person {
    String fullName;
    int age;

    public Person(){}

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    void move(){
        System.out.println(fullName + " is moving");
    }

    void talk(){
        System.out.println(fullName + " is talking");
    }

}
