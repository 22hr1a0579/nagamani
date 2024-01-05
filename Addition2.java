import java.io.*;
import java.util.Scanner;
class Addition2{
 public static void main(String []args)
 { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n1:");
    int n1=sc.nextInt();
    System.out.println("enter the value of n2:");
    int n2=sc.nextInt();
    int sum;
    sum=n1+n2;
    System.out.println(n1 +"+" +n2 +"="+sum);
  }
}