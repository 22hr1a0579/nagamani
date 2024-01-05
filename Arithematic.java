import java.io.*;
import java.util.Scanner;
class Arithematic{
 public static void main(String []args)
 { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    double num1=sc.nextDouble();
    System.out.println("enter second number:");
    double num2=sc.nextDouble();
    double sum=num1+num2;
    double difference=num1-num2;
    double product=num1*num2;
    double div=num1/num2;
    double mod=num1%num2;

if(num2==0){
    System.out.println("zero");
}

    System.out.println("sum="+sum);
    System.out.println("difference="+difference);
    System.out.println("product="+product);
    System.out.println("div="+div);
    System.out.println("mod="+mod);
  }
}