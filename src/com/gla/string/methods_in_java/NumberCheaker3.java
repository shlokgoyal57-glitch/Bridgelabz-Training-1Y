package methods_in_java;
import java.util.Arrays;
import java.util.Scanner;
public class NumberCheaker3 {
    public static int countdigits(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static int[] digitarray(int n){
        int[] array=new int[countdigits(n)];
        for(int i=array.length-1;i>=0;i--){
            array[i]=n%10;
            n=n/10;
        }
        return array;
    }
    public static int[] reversearray(int[] n){
      int[] r=new int[n.length];
        for(int i=0;i<r.length;i++){
            r[i]=n[n.length-1-i];
        }

        return r;
    }
    public static boolean comparearray(int[] d,int[] r){
        if(d.length!=r.length){
            return false;
        }
        for(int i=0;i<d.length;i++){
            if(d[i]!=r[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean ducknumber(int n){
        int[] d=digitarray(n);
        for(int i=1;i<d.length;i++){
            if(d[i]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        System.out.println("Digit Count: "+countdigits(n));
        int[] d=digitarray(n);
        int[] r=reversearray(d);
        System.out.println("Digit Array: "+ Arrays.toString(d));
        System.out.println("Reversed Array: "+Arrays.toString(r));
        boolean equal=comparearray(d,r);
        System.out.println("Arrays Equal: "+equal);
        if(equal){
            System.out.println("Palimdrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
        if(ducknumber(n)){
            System.out.println("Duck Number");
        }
        else {
            System.out.println("Not a Duck Number");
        }

    }
}
