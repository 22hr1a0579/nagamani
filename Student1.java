class Student1{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Program{
public static void main(String args[]){
Student1 ob1=new Student1();
ob1.setId(23445);
ob1.setName("test");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
}
}