class Student5{
int rollno;
String name;
float fee;

Student5(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+""+fee);}
}
class TestThis2{
public static void main(String args[]){
Student5 s1=new Student5(579,"nagamani",2000f);
Student5 s2=new Student5(112,"anuuuu",8000f);
s1.display();
s2.display();

}
}

