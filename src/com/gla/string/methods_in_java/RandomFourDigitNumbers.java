package methods_in_java;

import java.util.Arrays;

public class RandomFourDigitNumbers {
    public static int[] randomnumber(int s){
        int[] size=new int[s];
        for(int i=0;i<s;i++){
            size[i]=(int)(Math.random()*9000)+1000;
        }
        return size;

    }
    public static double[] findvalue(int[] n){
        double sum=0;
        int min=n[0];
        int max=n[0];
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
            min=Math.min(min,n[i]);
            max=Math.max(max,n[i]);
        }
        double a=sum/n.length;
        return new double[]{a,min,max};
    }
    public static void main(String[] args){
        int[] n=randomnumber(5);
        System.out.println("Generated Numbers: ");
        System.out.println(Arrays.toString(n));
        double[] result=findvalue(n);
        System.out.println("Average = "+result[0]);
        System.out.println("Minimum = "+result[1]);
        System.out.println("Maximum = "+result[2]);
    }
}
