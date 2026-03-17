package StringPracties;
import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the strings : ");
    String s=sc.nextLine();
    int v=0;
    int c=0;
    for(int i=0;i<s.length();i++){
        char h=s.charAt(i);
        if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'||
                h=='A'||h=='E'||h=='I'||h=='O'||h=='U'){
            v++;
        }
        else  if((h>='a'&&h<='z')||(h>='A'&&h<='Z')){
            c++;
        }
    }
        System.out.println("Number of Vowels: " + v);
        System.out.println("Number of Consonants: " + c);
    }
}
