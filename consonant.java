import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=new scob.next().charAt(0);
if(c>='A'&& c<='Z'||c>='a'&& c<='z')
System.out.println("alphabet");
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
System.out.println("vowel");
else
System.out.println("not a vowel");
if(c>='1'&& c<='9')
System.out.println("digit");
}}