class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="P M.REDDY";
}
Student(int r,String n){
rollno =r;
name =n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
public class Name{
public static void main(String args[]){
Student s1=new Student(23,"anuu");
Student s2=new Student(45,"kingg");
Student.change();
Student s3=new Student(67,"queen");
s1.display();
s2.display();
s3.display();
}
}