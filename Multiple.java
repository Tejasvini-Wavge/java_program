interface A
{
void run();
}
interface B
{
void show();
}
class Multiple implements A,B
{
public void run()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String args[])
{
Multiple obj =new Multiple();
obj.show();
obj.run();
}
}
