package methods_in_java;
import java.util.Random;

public class MatrixManipulation {
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] =  m[0][0]/det;
        return inv;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 2x2 matrix
        double[][] mat2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(mat2);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat2));
        System.out.println("Determinant: " + determinant2x2(mat2));
        System.out.println("Inverse:");
        displayMatrix(inverse2x2(mat2));

        double[][] mat3 = createRandomMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(mat3);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat3));
        System.out.println("Determinant: " + determinant3x3(mat3));
        System.out.println("Inverse:");
        displayMatrix(inverse3x3(mat3));
    }
}