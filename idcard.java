class Icard{
private String college_name;
private String college_address;
private int start;
private int end;
private int id;
private String student_name;
private String course_name;
private String aadhaar_no;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public void setCollege_address(String college_address)
{this.college_address=college_address;}
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setCourse_name(String course_name)
{this.course_name=course_name;}
public void setAadhaar_no(String aadharr_no)
{this.aadhaar_no=aadhaar_no;}
public void setId(int id)
{this.id=id;}
public String getCollege_name(){returm college_name}
public String getCollege_address(){return college_address}
public int getStart(){return start}
public int getEnd(){return end}
public int getId(){return id}
public String getStudent_name(){return student_name}
public String getCourse_name(){return course_name}
public String getAadhaar-no(){return aadhaar_no}
class BCA{
public static void main(String args[])
Icard i=new Icard();
i.setcollege_name("MTIET");
i.setcollege_address("Melmoi,Palamaner,Chittoor");
i.setStart(799);
i.setEnd(900);
i.setstudent_name("P.Nagamani");
i.setcourse_name("CSE");
i.setid_no(27834);
i.setaadhaar_no("6946 7208 9755");
System.out.println("college_name:"+i.getCollege_name());
System.out.println("college_address:"+i.getCollege_address());
System.out.println("start:"+i.getStart());
System.out.println("end:"+i.getEnd());
System.out.println("student_name:"+i.getStudent_name());
System.out.println("id_no:"+i.Id_no());
System.out.println("course_name:"+i.getCourse_name());
System.out.println("aadhaar_no:"+i.getAadhaar_name());
}
}
