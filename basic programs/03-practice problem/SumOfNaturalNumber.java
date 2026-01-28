import java.util.Scanner;
class SumOfNaturalNumber{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n>0){
System.out.println("Natural number");
}
else {
	System.out.println("Not a Natural number");
}
int result =  n*(n+1)/2;
System.out.println(result);



}



}