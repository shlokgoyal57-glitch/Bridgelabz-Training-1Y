package methods_in_java;
import java.util.Scanner;
public class FindRootsOfQuadratic {
    public static double[] findroot(double a,double b,double c){
        double de =Math.pow(b,2)-(4*a*c);
        if(de >0){
            double root1=(-b+Math.sqrt(de))/(2*a);
            double root2=(-b-Math.sqrt(de))/(2*a);
            return new double[]{root1,root2};
        }
        else if(de==0){
            double root=(-b)/(2*a);
            return new double[]{root};
        }
        else {
            return new double[]{};
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a ");
        int a=sc.nextInt();
        System.out.println("enter the b ");
        int b=sc.nextInt();
        System.out.println("enter the c ");
        int c=sc.nextInt();
        double[] roots=findroot(a,b,c);
        if (roots.length == 2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }
        else if (roots.length == 1) {
            System.out.println("One real root:");
            System.out.println("Root = " + roots[0]);
        }
        else {
            System.out.println("No real roots.");
        }
    }
}
