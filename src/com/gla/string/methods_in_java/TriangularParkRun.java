package methods_in_java;
import java.util.Scanner;
public class TriangularParkRun {
    public static double rounds(double a,double b,double c){
        double p=a+b+c;
        double r=5000/p;
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the all sides in meters ");
        System.out.println("enter the first side ");
        double first = sc.nextDouble();
        System.out.println("enter the second side ");
        double second = sc.nextDouble();
        System.out.println("enter the third side ");
        double third = sc.nextDouble();
        double round = rounds(first,second,third);
        System.out.println("Number of rounds required to complete 5 km run = " + round);
    }
}
