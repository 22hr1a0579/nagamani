import java.util.Scanner;
class Numbers6{
public static void main(String args[])
{ 
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
 // for(int i=0;i>=n;i=i+5)
  int i=n;
  while(i>=0){
  System.out.print(i+",");
  i=i-5;

}
}
}