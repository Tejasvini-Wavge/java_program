class StaticVarStud{
int id;
String name;
static String institute="KDN INOFOTECH";
StaticVarStud(int i ,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println("id = "+id+"name = "+name+"institute = "+institute);
}
public static void main(String args[])
{
StaticVarStud s1 = new StaticVarStud(101,"abc");
StaticVarStud s2 = new StaticVarStud(102,"xyz");
s1.display();
s2.display();
}
}


