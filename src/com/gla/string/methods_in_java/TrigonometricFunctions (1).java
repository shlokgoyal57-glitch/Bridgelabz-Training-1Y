package methods_in_java;
import java.util.Scanner;
public class TrigonometricFunctions {
    public static double calculatesin(double r){
    double s=Math.sin(r);
    return s;
    }
    public static double calculatecos(double r){
        double c=Math.cos(r);
        return c;
    }
    public static double calculatetan(double r){
        double t=Math.tan(r);
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the angle in degree ");
        double d= sc.nextDouble();
        double r=Math.toRadians(d);
        double s=calculatesin(r);
        double c=calculatecos(r);
        double t=calculatetan(r);
        System.out.println("sin = "+s);
        System.out.println("cos = "+c);
        System.out.println("tan = "+t);

    }
}
