package methods_in_java;
import java.util.Scanner;
public class FactorsCalculator {
    public static int[] FindFactor(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        int[] array=new int[c];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                array[index]=i;
                index++;
            }
        }
        return array;
    }
    public static int FindSum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return s;
    }
    public static int FindProduct(int n){
        int p=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                p=p*i;
            }
        }
        return p;
    }
    public static double SquareSum(int n){
        double s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s=Math.pow(i,2)+s;
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int[] array= FindFactor(n);
        System.out.println("factors =  ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nSum of factors: " + FindSum(n));
        System.out.println("Product of factors: " + FindProduct(n));
        System.out.println("Sum of squares of factors: " + SquareSum(n));

    }
}
