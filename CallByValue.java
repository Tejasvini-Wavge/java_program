class CallByValue
{
int  data=50;
void  change(int data)
{
data=data+100;
System.out.println("Data="+data);
}
public static void main(String args[])
{
CallByValue c1=new CallByValue();
System.out.println("before change "+c1.data);
c1.change(500);
System.out.println("after change "+c1.data);
}
}
