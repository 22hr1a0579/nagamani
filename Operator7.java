import java.util.Scanner;
public class Operator7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number:");
int num1=sc.nextInt();
System.out.println("enter second number:");
int num2=sc.nextInt();
System.out.println("num1>num2is"+(num1>num2));
System.out.println("num1<num2is"+(num1<num2)); 
System.out.println("num1>=num2is"+(num1>=num2));
System.out.println("num1<=num2is"+(num1<=num2));
System.out.println("num1==num2is"+(num1==num2));
System.out.println("num1!=num2is"+(num1!=num2)); 
}
}