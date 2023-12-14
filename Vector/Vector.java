package OOP.Vector;
import java.util.ArrayList;
import java.util.Random;

public class Vector {
    private final int x;
    private final int y;
    private final int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public static int scalarMultiplication(Vector vector, Vector vector1) {
        return (vector.getX() * vector1.getX()) + (vector.getY() * vector1.getY()) + (vector.getZ() * vector1.getZ());
    }

    public static ArrayList<Integer> productVectorByVector(Vector vector, Vector vector1) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(vector.getY() * vector1.getZ() - vector.getZ() * vector1.getY());
        result.add(vector.getZ() * vector1.getX() - vector.getX() * vector1.getZ());
        result.add(vector.getX() * vector1.getY() - vector.getY() * vector1.getX());
        return result;
    }

    public static double cosineAngle(Vector vector, Vector vector1) {
        return scalarMultiplication(vector, vector1) / (Math.abs(vector.length()) * Math.abs(vector1.length()));
    }

    public static ArrayList<Vector> generate(int N){
        Random random = new Random();
        ArrayList<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Vector vector = new Vector(random.nextInt(-256, 255), random.nextInt(-256, 255), random.nextInt(-256, 255));
            vectors.add(vector);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector:{\n" +
                "\tx = " + x +
                "\n\ty = " + y +
                "\n\tz = " + z + "\n}";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
