import java.util.Scanner;
class digit{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c>'0'||c>'9')
System.out.println("character is digit");
else
System.out.println("character is not digit");
}}
