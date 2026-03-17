package BuiltInFunction;
import java.util.Scanner;
public class primeNumberCheaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();
        int k=0;
        for (int i = 21; i <= n / 2; i++) {
            if(n%i==0){
                k=1;
            }

        }
        if (k==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
