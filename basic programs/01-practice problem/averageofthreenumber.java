import java.util.Scanner;

public class averageofthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = sc.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("Average = " + average);
        
        sc.close();
    }
}