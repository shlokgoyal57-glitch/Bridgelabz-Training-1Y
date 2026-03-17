package methods_in_java;
import java.util.Scanner;
public class StudentVoteCheaker {
    public static boolean cheakvote(int n){
            if(n<18){
                return false;
            }
            else {
                return true;
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("enter the age of student "+(i+1)+" = ");
            age[i]= sc.nextInt();
            boolean k=cheakvote(age[i]);
            if(k){
                System.out.println("Student can be a Vote ");
            }
            else {
                System.out.println("Student cannot be vote ");
            }
        }
    }
}
