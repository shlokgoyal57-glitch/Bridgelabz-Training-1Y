package methods_in_java;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int addnum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum = addnum(n);
        System.out.println("sum = "+sum);
    }
}
