import java.util.Scanner;
class Num1{
public static void main(String args[])
{ 
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int i=0;
  do{
  System.out.print(i+",");
  i=i+5;
  }while(i<=n);

}
}
