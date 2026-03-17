package BuiltInFunction;
import java.util.Scanner;
public class GCDandLCMCalculator {
    public static int findgcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findlcm(int a,int b){
        int gcd=findgcd(a,b);
        int lcm=(a*b)/gcd;
        return lcm;
    }
    public static void result(int a,int b){
        System.out.println("LCM = "+a);
        System.out.println("GCD = "+b);
    }
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int number1 = sc.nextInt();
        System.out.println("enter the second number ");
        int number2 = sc.nextInt();
        int GCD = findgcd(number1,number2);
        int LCM = findlcm(number1,number2);
        result(LCM,GCD);
    }
}
