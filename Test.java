import java.util.Scanner;
class Test{
public static void displayday(int n)
{
switch(n)
{
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MONDAY");break;
case 2:System.out.println("TUEDAY");break;
case 3:System.out.println("WEDNESDAY");break;
case 4:System.out.println("THUDAY");break;
case 5:System.out.println("FRIDAY");break;
case 6:System.out.println("SATDAY");break;
default:System.out.println("INVALID");
}}

public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
displayday(dn);
}}



