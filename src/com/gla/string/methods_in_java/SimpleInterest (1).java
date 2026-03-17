package methods_in_java;
import java.util.Scanner;
public class SimpleInterest {
    public static double calculatesimpleinterest(double p,double r,double t){
        double s=(p*r*t)/100;
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the principle ");
        double p = sc.nextDouble();
        System.out.println("enter the rate ");
        double r = sc.nextDouble();
        System.out.println("enter the time ");
        double t = sc.nextDouble();
        double si = calculatesimpleinterest(p,r,t);
        System.out.println("Simple Interest = "+si);
    }
}
