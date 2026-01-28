import java.util.Scanner;
class CheckLargestOfTheThree{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
int number1 = sc.nextInt();
System.out.println("Enter second number");
int number2 = sc.nextInt();
System.out.println("Enter third number");
int number3 = sc.nextInt();
if(number1>=number2 && number1>=number3){
System.out.println("Is The First Number Largest?True");
System.out.println("Is The Second Number Largest?False");
System.out.println("Is The  third Number Largest?False");
}
else if(number2>=number1 && number2>=number3 ){
System.out.println("Is The First Number Largest?False");
System.out.println("Is The Second Number Largest?True");
System.out.println("Is The  third Number Largest?False");
}
else {
System.out.println("Is The First Number Largest?False");
System.out.println("Is The Second Number Largest?False");
System.out.println("Is The  third Number Largest?True");

}


}








}