package BuiltInFunction;
import java.util.Scanner;
public class PalindromeChecker {
    public static String toinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        return sc.nextLine();
    }
    public static void ischeak(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            r=r+c;
        }
        if(s.equalsIgnoreCase(r)){
            System.out.println("palimdrome");
        }
        else {
            System.out.println("not palimdrome");
        }
    }

   public static void main(String[] args) {
        String input= toinput();
        ischeak(input);
    }
}
