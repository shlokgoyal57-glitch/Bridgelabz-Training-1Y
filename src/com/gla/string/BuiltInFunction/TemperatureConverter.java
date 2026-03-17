package BuiltInFunction;
import java.util.Scanner;
public class TemperatureConverter {
    public static int tochoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }
    public static double tocelsius(double t){
        double c = (t-32)*5/9;
        return c;
    }
    public static double tofahrenheit(double t){
        double f = ((t*9)/5)+32;
        return f;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice = tochoice();
        System.out.println("enter the temperature ");
        double t = sc.nextDouble();
        if(choice==1){
            double f = tofahrenheit(t);
            System.out.println("fahrenheit = "+f);
        }
        else {
            double c = tocelsius(t);
            System.out.println("celsius = "+c);
        }
    }
}
