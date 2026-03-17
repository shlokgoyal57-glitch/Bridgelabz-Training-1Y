package methods_in_java;
import java.util.Scanner;
public class SpringSeason {
    public static boolean season(int m,int d){
        if((m==3&&d>=20)||(m==4)||(m==5)||(m==6&&d<=20)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the month ");
        int month = sc.nextInt();
        System.out.println("enter the day ");
        int day = sc.nextInt();
        boolean s = season(month,day);
        if(s){
            System.out.println("Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}
