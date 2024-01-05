class Employee{
int id;
String name;
String department;
void insertRecord(int r,String n,string p)
{
id=r;
name=n;
department=p;
}
void displayInformation()
{
System.out.println(id+" "+name+" "+department);
}
}
class TestStudent{
public static void main(String args[])
{
Employee s1=new Employee();
Employee s2=new Employee();
Employee s3=new Employee();
s1.insertRecord(333,"anu","AI");
s2.insertRecord(444,"bindhu","CSE");
s3.insertRecord(999,"sindhu""ECE");
s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
}}