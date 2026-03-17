package methods_in_java;
import java.util.Scanner;
public class UnitConvertor {
    public static double kilometertomiles(double n){
        double k=0.621371*n;
        return k;
    }
    public static double milestokilometer(double n){
        double m=1.60934*n;
        return m;
    }
    public static double metertofeet(double n){
        double m=3.28084*n;
        return m;
    }
    public static double feettometer(double n){
        double f=0.3084*n;
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the kilometer ");
        double k= sc.nextDouble();
        System.out.println("Miles = "+kilometertomiles(k));
        System.out.println("enter the miles ");
        double m=sc.nextDouble();
        System.out.println("kilometer = "+milestokilometer(m));
        System.out.println("enter the meter = ");
        double me=sc.nextDouble();
        System.out.println("feet = "+metertofeet(me));
        System.out.println("enter the  feet = ");
        double f=sc.nextDouble();
        System.out.println("Meters = "+feettometer(f));
    }
}
