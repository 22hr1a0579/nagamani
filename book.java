class Book{
private String name;
private String cls;
private String section;
private String subject;
private String college;
public void setName(String name){this.name=name;}
public void setCls(String cls){this.cls=cls;}
public void setSection(String section){this.section=section;}
public void setSubject(String subject){this.subject=subject;}
public void setCollege(String college){this.college=college;}
public String getName(){return name;}
public String getCls(){return cls;}
public String getSection(){return section;}
public String getSubject(){return subject;}
public String getCollege(){return college;}
}
class BCA{
public static void main(String args[]){
Book b=new Book();
b.setName("nagamani");
b.setCls(" cse");
b.setSection("B");
b.setSubject("OOPJ");
b.setCollege("MTIET");
System.out.println("name:"+b.getName());
System.out.println("class:"+b.getCls());
System.out.println("section:"+b.getSection());
System.out.println("subject:"+b.getSubject());
System.out.println("college:"+b.getCollege());
}
}