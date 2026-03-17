package methods_in_java;
import java.util.Scanner;
public class ChocolateDistribution {
    public static int eachchildren(int s,int c){
        int e=s/c;
        return e;
    }
    public  static int reaminingchocolate(int s,int c){
        int r=s%c;
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students ");
        int s=sc.nextInt();
        System.out.println("enter the number of chocolate ");
        int c=sc.nextInt();
        if (c == 0) {
            System.out.println("Children cannot be zero.");
        }
        else {
            int e=eachchildren(s,c);
            int r=reaminingchocolate(s,c);
            System.out.println("Each child gets = "+e);
            System.out.println("Remaining chocolates = "+r);
        }
    }
}
