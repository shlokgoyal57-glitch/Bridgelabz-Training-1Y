package methods_in_java;
import java.util.Scanner;

class GeometryUtility {
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        // Using multiplication to avoid division by zero
        // Slope AB = (y2 - y1)/(x2 - x1)
        // Slope BC = (y3 - y2)/(x3 - x2)
        // Slope AC = (y3 - y1)/(x3 - x1)
        return ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) &&
                ((y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1));
    }
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area formula: 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by slope formula: " + collinearSlope);

        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by area formula: " + collinearArea);


    }
}