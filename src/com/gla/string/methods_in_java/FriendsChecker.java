package methods_in_java;
import java.util.Scanner;
public class FriendsChecker {
    public static int findyoungest(int[] age,String[] name){
        int min=age[0];
        for(int i=0;i<3;i++){
            if(age[i]<min){
                min=age[i];
            }
        }
        return min;
    }
    public static int findtallest(int[] height,String[] name){
        int max=height[0];
        for(int i=0;i<3;i++){
            if(max<height[i]){
                max=height[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] name={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("enter the age of "+name[i]+" = ");
            age[i]= sc.nextInt();
            System.out.println("enter the height of "+name[i]+" = ");
            height[i]= sc.nextInt();
        }
        int younger=findyoungest(age,name);
        int taller=findtallest(height,name);
        System.out.println("\nYoungest friend is: " + younger);
        System.out.println("Tallest friend is: " + taller);
    }
}
