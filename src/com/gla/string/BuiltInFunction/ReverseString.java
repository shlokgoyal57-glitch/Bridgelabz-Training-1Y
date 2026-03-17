package StringPracties;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings : ");
        String s=sc.nextLine();
        String r="";
        int v=s.length();
        for(int i=v-1;i>=0;i--){
            char c=s.charAt(i);
            r=r+c;
        }
        System.out.println("reverse string : "+r);
    }
}
