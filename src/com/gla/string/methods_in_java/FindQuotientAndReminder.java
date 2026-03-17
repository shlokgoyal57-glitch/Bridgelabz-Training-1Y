package methods_in_java;
import java.util.Scanner;
public class FindQuotientAndReminder {
    public static int findquotient(int n,int d){
        int q=n/d;
        return q;
    }
    public static int findreminder(int n,int d){
        int r=n%d;
        return r;
    }
    public static void result(int q,int r){
        System.out.println("Quotient = "+q);
        System.out.println("Reminder = "+r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number is ");
        int number=sc.nextInt();
        System.out.println("enter the divisor is ");
        int divisor=sc.nextInt();
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int q = findquotient(number, divisor);
            int r = findreminder(number, divisor);
            result(q, r);
        }
    }
}
