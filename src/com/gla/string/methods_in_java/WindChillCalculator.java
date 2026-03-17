package methods_in_java;
import java.util.Scanner;
public class WindChillCalculator {
    public static double windchill(double t,double s){
        double w=35.74+(0.6215*t)+(0.4275*t+-35.75)*Math.pow(s,0.16);
        return w;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature is ");
        double t=sc.nextDouble();
        System.out.println("enter the wind speed ");
        double s=sc.nextInt();
        double ws=windchill(t,s);
        System.out.println("Wind Chill = "+ws);
    }
}
