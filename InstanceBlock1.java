class InstanceBlock1
{
int speed;
InstanceBlock1()
{
System.out.println("constructor");
}
{
  System.out.println("instance initializer block "); //instance initializer block
}
public static void main(String args[])
{
InstanceBlock1 b1 =new InstanceBlock1();
}
}
