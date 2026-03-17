package StringPracties;
import  java.util.Scanner;
public class LongestWordInSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings : ");
        String s=sc.nextLine();
        String[] w=s.split(" ");
        String l="";
        for(int i=0;i<w.length;i++){
            if(w[i].length()>l.length()){
                l=w[i];
            }

        }
        System.out.println(l);
    }
}
