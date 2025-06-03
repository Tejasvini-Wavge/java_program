class ObjectClone implements Cloneable
{
int rollno;
String name;
ObjectClone(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
public Object Clone() throws CloneNotSupportedException
{
return super.clone();
}
public static void main(String args[])
{
try
{
ObjectClone s1=new ObjectClone(101,"teju");
ObjectClone s2=(ObjectClone)s1.Clone();
System.out.println(s1.rollno+" " +s1.name);
System.out.println(s2.rollno+" " +s2.name);
}
catch(CloneNotSupportedException c)
{
System.out.println(c);
}
}
}