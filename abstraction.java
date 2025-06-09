abstract class Example
{
abstract void run();
}
class Exmaple1 extends Example
{
void run()
{
System.out.println("hello abstraction");
}
public static void main(String args[])
{
Example obj=new Exmaple1();
obj.run();
}
}
