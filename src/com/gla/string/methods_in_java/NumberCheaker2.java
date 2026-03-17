package methods_in_java;
import java.util.Scanner;
public class NumberCheaker2 {
    public static int countnumber(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int[] digitarray(int n){
        int[] array=new int[countnumber(n)];
        for(int i=array.length-1;i>=0;i--){
            array[i]=n%10;
            n=n/10;
        }
        return array;
    }
    public static int sumofdigit(int n){
        int sum=0;
        while (n!=0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static int sumofsquareofnumber(int n){
        int sum=0;
        while (n!=0){
            int temp=n%10;
            sum=sum+(temp*temp);
            n=n/10;
        }
        return sum;
    }
    public static boolean harshednumber(int n){
        double sum=sumofdigit(n);
        double h=n/sum;
        if(h==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static int[] digitfrequency(int n){
        int[] f=new int[10];
        int[] d=digitarray(n);
        for(int i=0;i<d.length;i++){
            f[d[i]]++;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        System.out.println("Digits Count: "+countnumber(n));
        System.out.println("Sum of Digits: "+sumofdigit(n));
        System.out.println("Sum of Square of Digits: "+sumofsquareofnumber(n));
        System.out.println("Harshed Number: "+harshednumber(n));
        System.out.println("Digits Frequency: ");
        int[] d=digitfrequency(n);
        for(int i=0;i<d.length;i++){
            if(d[i]>0){
                System.out.println("Digit "+i+" -> "+d[i]);
            }
        }
    }
}