class Circle{
int radius;
void insert(int l){
radius=l;
}
void calculatePerimeter(){
System.out.println(2*3.14*radius);}
}
class TestCircle{
public static void main(String args[]){
Circle r1=new Circle();
r1.insert(7);
r1.calculatePerimeter();
}}
