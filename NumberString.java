 import java.util.Scanner;
class NumberString{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Number n;
int rs=0;
System.out.println("enter a number:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)  
    { rs=rs+n.charAt(i);}
  if(n.equals(rs))
{System.out.println("palindrome");}
else
{System.out.println("not palindrome");}
}
}