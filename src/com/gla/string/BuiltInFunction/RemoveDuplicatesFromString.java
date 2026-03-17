package StringPracties;
import java.util.Scanner;
public class RemoveDuplicatesFromString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the string : ");
        String s=sc.nextLine();
        String n="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(n.indexOf(c)==-1){
                n=n+c;
                }
        }
        System.out.println(n);
    }
}
