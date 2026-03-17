package methods_in_java;
import java.util.Scanner;

class GeometryUtility2 {
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m;
        double b;

        if (x2 - x1 == 0) {
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        } else {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        }

        return new double[]{m, b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = GeometryUtility2.euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between points: %.4f\n", distance);

        double[] line = GeometryUtility2.lineEquation(x1, y1, x2, y2);
        double m = line[0];
        double b = line[1];

        if (Double.isInfinite(m)) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4f * x + %.4f\n", m, b);
        }

    }
}