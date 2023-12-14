package OOP.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(2, 4, 5);
        Vector vector1 = new Vector(4, 5, 3);
        System.out.println(Vector.scalarMultiplication(vector, vector1));
        System.out.println(vector.length());
        System.out.println(vector1.length());
        System.out.println(Vector.cosineAngle(vector, vector1));
        System.out.println(Vector.generate(5));
        System.out.println(vector.toString());
    }
}
