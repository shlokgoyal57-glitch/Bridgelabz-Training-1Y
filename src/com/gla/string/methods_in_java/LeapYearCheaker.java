package methods_in_java;
import java.util.Scanner;
public class LeapYearCheaker {
    public static boolean leapyearcheaker(int y){
        if(y<1582){
            return false;
        }
        else {
            if((y%4==0&&y%100!=0)||(y%400==0)){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        boolean f=leapyearcheaker(n);
        if(n<1582){
            System.out.println("enter the above value ");
        }
        else {
            if(f){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year ");
            }
        }
    }
}
