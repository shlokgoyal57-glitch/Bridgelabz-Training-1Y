package methods_in_java;
import java.util.Scanner;
public class NumberCheaker {
    public static int checkposiandnega(int n){
        if(n<0){
            return -1;
        }
        else  {
            return 1;
        }

    }
    public static boolean checkevenandodd(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] number=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter the number "+(i+1));
            number [i]=sc.nextInt();
        }
        System.out.println("Checking Numbers: ");
        for(int i=0;i<5;i++){
            int p=checkposiandnega(number[i]);
            boolean e=checkevenandodd(number[i]);
            if(p==1){
                if(e){
                    System.out.println(number[i]+" is Positive and Even ");
                }
                else {
                    System.out.println(number[i]+" is Positive and Odd ");
                }
            }
            else if(p==-1){
                System.out.println(number[i]+" is Negative ");
            }

        }
        System.out.println("\nComparing First and Last Elements:");
        if(number[0]>number[4]){
            System.out.println("First element is Greater then Last element ");
        }
        else if(number[0]==number[4]){
            System.out.println("First element is Equal to Last element ");
        }
        else {
            System.out.println("First element is Less than Last element ");
        }

    }
}
