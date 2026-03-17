package BuiltInFunction;

import java.util.Scanner;

public class BasicCalculator {
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a, double  b){
        if(b==0) {
            System.out.println("division by zero is not allowed");
            return a;
        }
            else {
                return a/b;
            }
        }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("------------Basic Calculator-----------");
            System.out.println("enter the first number ");
            double result=sc.nextInt();
            while(true) {
                System.out.println("choos   +,-,/,*  ");
                System.out.println("exit press q or Q ");
                char c = sc.next().charAt(0);
                if(c=='q'||c=='Q'){
                    break;
                }
                System.out.println("enter the second number ");
                double number = sc.nextDouble();
                switch (c) {
                    case '+':
                        result = add(result, number);
                        break;
                    case '-':
                        result = subtract(result, number);
                        break;
                    case '*':
                        result = multiply(result, number);
                        break;
                    case '/':
                        result = divide(result, number);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
                System.out.println("Current Result = " + result);
            }
            System.out.println("Final Result = " + result);
        }
}
