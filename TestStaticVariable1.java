class Student{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{System.out.println(rollno+""+name+""+college);}
}
public class TestStaticVariable1{
public static void main(String args[]){
Student s1=new Student(579,"nagamani");
Student s2=new Student(234,"Anuu");
Student.college="A M REDDY";
s1.display();
s2.display();
}
}