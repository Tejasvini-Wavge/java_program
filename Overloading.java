class Overloading
{
void add()
{
int a=10,b=20;
int c=a+b;
System.out.println(c);
}
void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
void add(int a,int b,double c)
{
double d=a+b+c;
System.out.println(d);
}
public static void main(String args[])
{
Polymorphism p1=new Polymorphism();
p1.add();
p1.add(10,20,30);
p1.add(10,20.60);
}
}


