package methods_in_java;
import java.util.Scanner;
public class HandShakes {
    public static double tohandshakes(int n){
        double r = (n*(n-1))/2;
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of students ");
        int number = sc.nextInt();
        double handshakes = tohandshakes(number);
        System.out.println("Maximum number of possible handshakes = " + handshakes);
    }
}
