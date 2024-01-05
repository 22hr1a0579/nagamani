import java.util.Scanner;
class Continue1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
      
      int i=0;
      while(i<25){
i++;
System.out.print(i+"");
if(i%5==0)continue;
System.out.print(i+"");
}
      }
}
    