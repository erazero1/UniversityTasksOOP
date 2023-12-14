package OOP.Matrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int row = rand.nextInt(1, 5);
        int column = rand.nextInt(1, 5);
        double[][] doubles = new double[row][column];
        double[][] doubles1 = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                doubles[i][j] = rand.nextInt(1, 10);
                doubles1[i][j] = rand.nextInt(1, 10);
            }
        }
        Matrix matrix = new Matrix(doubles, column, row);
        Matrix matrix1 = new Matrix(doubles1, column, row);
        System.out.println("Matrix 1:");
        matrix.printMatrix();
        System.out.println("Matrix 2:");
        matrix1.printMatrix();
        System.out.println("Addition of this matrices");
        Matrix temp = new Matrix(matrix.addition(matrix, matrix1), matrix.getColumn(), matrix.getRow());
        temp.printMatrix();

        System.out.println("Multiple matrix 1 by constant(2.5):");
        matrix.multiplyByConstant(2.5);
    }
}
