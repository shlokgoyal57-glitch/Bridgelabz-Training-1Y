package BuiltInFunction;
import java.util.Scanner;
public class Factorial {
    public static int toinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        return sc.nextInt();
    }
    public static int tofactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void result(int f){
        System.out.println("factorial = "+f);
    }
    static void main(String[] args) {
    int number = toinput();
    int factorial = tofactorial(number);
    result(factorial);
    }
}
