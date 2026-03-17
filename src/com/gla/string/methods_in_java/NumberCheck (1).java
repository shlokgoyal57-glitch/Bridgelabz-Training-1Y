package methods_in_java;
import java.util.Scanner;
public class NumberCheck {
    public static double numbercheck(double n){
        if(n<0){
            return -1.0;
        }
        else if(n>0){
            return 1.0;
        }
        else {
            return 0.0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        double number = sc.nextDouble();
        double r=numbercheck(number);
        if (r == 1)
            System.out.println("The number is Positive");
        else if (r == -1)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is Zero");

    }

}
