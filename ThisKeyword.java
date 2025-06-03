class ThisKeyword
{
void show()
{
System.out.println(this);
}
public static void main(String args[])
{
ThisKeyword t1 =new ThisKeyword();
System.out.println(t1);
t1.show();
}
}


