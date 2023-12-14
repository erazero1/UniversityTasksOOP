package OOP.Matrix;

public class Matrix {
    private final double[][] doublesMatrix;

    private final int row;
    private final int column;

    public Matrix(double[][] doublesMatrix, int column, int row) {
        this.doublesMatrix = doublesMatrix;
        this.column = column;
        this.row = row;
    }


    public void multiplyByConstant(double constant) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                doublesMatrix[i][j] *= constant;
                System.out.print(doublesMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] addition(Matrix firstMatrix, Matrix secondMatrix) {
        double[][] result = new double[row][column];
        if (firstMatrix.getColumn() == secondMatrix.getColumn() && firstMatrix.getRow() == secondMatrix.getRow()) {
            for (int i = 0; i < firstMatrix.getRow(); i++) {
                for (int j = 0; j < firstMatrix.getColumn(); j++) {
                    result[i][j] = firstMatrix.getDoublesMatrix()[i][j] + secondMatrix.getDoublesMatrix()[i][j];
                }
            }
        } else {
            System.out.println("A matrix can only be added to another matrix if the two matrices have the same dimensions");
        }
        return result;
    }


    public double[][] multiplication(Matrix firstMatrix, Matrix secondMatrix){
        double[][] result = new double[row][column];
        if (firstMatrix.getRow() == secondMatrix.getColumn() || firstMatrix.getColumn() == secondMatrix.getRow()) {
            for (int i = 0; i < firstMatrix.getRow(); i++) {
                for (int j = 0; j < firstMatrix.getColumn(); j++) {
                    result[i][j] = firstMatrix.getDoublesMatrix()[i][j] + secondMatrix.getDoublesMatrix()[i][j];
                }
            }
        } else {
            System.out.println("A matrix can only be added to another matrix if the two matrices have the same dimensions");
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(doublesMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] getDoublesMatrix() {
        return doublesMatrix;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
