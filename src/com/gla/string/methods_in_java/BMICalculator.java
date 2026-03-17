package methods_in_java;
import java.util.Scanner;
public class BMICalculator {
    public static double findBMI(double w,double h){
        h=h/100;
        double r= w/(h*h);
        return r;
    }
    public static String BMIstatic(double r){
            if (r < 18.5) {
                String u="Underweight";
                return u;

            }
            else if (r >= 18.5 && r < 24.9) {
                String n="Normal Weight";
                return n;

            }
            else if (r >= 25 && r < 29.9) {
                String ov="Overweight";
                return ov;

            }
            else {
                String ob="Obese";
                return ob;

            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] weight=new double[10];
        double[] height=new double[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter details for person "+(i+1));
            System.out.print("Enter Weight (Kg):");
            weight[i]= sc.nextDouble();
            System.out.print("Enter Height (cm):");
            height[i]= sc.nextDouble();
        }
        System.out.println("------------BMI Report-------------");
        for(int i=0;i<10;i++){
            double bmi=findBMI(weight[i],height[i]);
            String status=BMIstatic(bmi);
            System.out.printf("Person %d -> Weight: %.2f Kg, Height: %.2f cm, BMI: %.2f, Status: %s\n",(i+1),weight[i],height[i],bmi,status);
        }
    }
}
