import java.util.Scanner;
class Test{
public static void main(String args[])
{
 boolean cond=true;
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 Boolean cond=sc.nextBoolean();
 
 System.out.println("cond is:"+cond);
 System.out.println("var1="+a);
 System.out.println("var2="+b);
 System.out.println("now cond is:"+!cond);
 System.out.println("!(a<b)="+!(a<b));
 System.out.println("!(a>b)="+!(a>b));
}
}
