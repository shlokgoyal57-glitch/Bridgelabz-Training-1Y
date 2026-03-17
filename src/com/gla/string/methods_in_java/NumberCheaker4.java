package methods_in_java;
import java.util.Scanner;
public class NumberCheaker4 {
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isneon(int n){
        int s=n*n;
        int sum=0;
        while(s!=0){
            sum=sum+s%10;
            s=s/10;
        }
        if(sum==n){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isspy(int n){
        int s=0;
        int p=1;
        while(n!=0){
            int temp=n%10;
            s=s+temp;
            p=p*temp;
            n=n/10;
        }
        if(s==p){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isautomorphic(int n){
        int t=n;
        int s=n*n;
        while(t>0){
            if(t%10!=s%10){
                return false;
            }
            t=t/10;
            s=s/10;
        }
        return true;
    }
    public static boolean isbuzz(int n){
        return (n%10==7||n%7==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
            System.out.println("Prime Number: "+isprime(n));
            System.out.println("Neon Number: "+isneon(n));
            System.out.println("Spy Number: "+isspy(n));
            System.out.println("Automorphic Number: "+isautomorphic(n));
            System.out.println("Buzz Number: "+isbuzz(n));
    }
}
