
import java.util.Scanner;
class Difference{
 public static void main(String []args)
 { 
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int diff;
    if(n1>n2)
    diff=n1-n2;
    else
    diff=n2-n1;
    System.out.println(diff);
  }
}