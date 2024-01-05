class Student2{

private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Program1{
public static void main(String args[]){
Student2[] ob=new Student2[3];
ob[0]=new Student2();
ob[0].setId(23445);
ob[0].setName("test");
System.out.println("ID:"+ob[0].getId());
System.out.println("Name:"+ob[0].getName());
ob[1]=new Student2();
ob[1].setId(23445);
ob[1].setName("nagamani");
System.out.println("ID:"+ob[1].getId());
System.out.println("Name:"+ob[1].getName());
ob[2]=new Student2();
ob[2].setId(45677);
ob[2].setName("Palamanerr");
System.out.println("ID:"+ob[2].getId());
System.out.println("Name:"+ob[2].getName());
}
}