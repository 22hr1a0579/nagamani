class Age4{
public static void main(String args[])
{
int[] numbers={12,4,5,7,11,-6,21,8};
int sum=0;
Double average;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Average="+average);
}
}

