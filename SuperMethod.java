class Person
{
void msg()
{
System.out.println("welcome");
}
}
class SuperMethod extends Person
{
void msg()
{
System.out.println("welcome to java");
}
void display()
{
msg();
super.msg();
}
public static void main(String args[]){
SuperMethod s=new SuperMethod();
s.display();
}
}



