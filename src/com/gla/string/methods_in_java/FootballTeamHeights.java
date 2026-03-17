package methods_in_java;

import java.util.Arrays;

public class FootballTeamHeights {
    public static int[] randomheight(int n){
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            r[i]=(int)(Math.random()*101)+150;
        }
        return r;
    }
    public static int sumheight(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        return sum;
    }
    public static double meanheight(int[] n){
        double a=(double) sumheight(n)/n.length;
        return a;
    }
    public static int shortestheight(int[] n){
        int s=n[0];
        for(int i=0;i<n.length;i++){
            if(s>n[i]){
                s=n[i];
            }
        }
        return s;
    }
    public static int tallestheight(int[] n){
        int t=n[0];
        for(int i=0;i<n.length;i++){
            if(t<n[i]){
                t=n[i];
            }
        }
        return t;
    }
    public static void main(String[] args){
        int[] heights=randomheight(11);
        System.out.println("Player Height (cm): ");
        System.out.println(Arrays.toString(heights));
        System.out.println("Sum of Heights = "+sumheight(heights));
        System.out.println("Mean Height = "+meanheight(heights));
        System.out.println("Shortest Height = "+shortestheight(heights));
        System.out.println("Tallest Height = "+tallestheight(heights));

    }
}
