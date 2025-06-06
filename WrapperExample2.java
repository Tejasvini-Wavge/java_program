public class WrapperExample2
{
public static void main(String args[])
{
Integer a=new Integer(3);
int i=a.intValue(); //converting Integer to int
int j=a;   //unboxing
System.out.println(a+ "  " +i+"  "+j);
}
}
