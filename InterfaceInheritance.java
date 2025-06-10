nterface printable
{
void run();
}
interface showable extends printable
{
void show();
}
class InterfaceInheritance implements showable
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
