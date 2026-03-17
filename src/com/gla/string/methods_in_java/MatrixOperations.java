package methods_in_java;
import java.util.Random;
import java.util.Arrays;

class MatrixOperations {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = A[i][j] - B[i][j];
            }
        }
        return diff;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible: colsA != rowsB");
        }

        int[][] product = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] matrixA = MatrixOperations.createRandomMatrix(rows, cols);
        int[][] matrixB = MatrixOperations.createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        MatrixOperations.printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        MatrixOperations.printMatrix(matrixB);

        int[][] sum = MatrixOperations.addMatrices(matrixA, matrixB);
        System.out.println("\nA + B:");
        MatrixOperations.printMatrix(sum);

        int[][] diff = MatrixOperations.subtractMatrices(matrixA, matrixB);
        System.out.println("\nA - B:");
        MatrixOperations.printMatrix(diff);

        int[][] prod = MatrixOperations.multiplyMatrices(matrixA, matrixB);
        System.out.println("\nA * B:");
        MatrixOperations.printMatrix(prod);
    }
}