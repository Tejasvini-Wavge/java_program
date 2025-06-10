interface printable
{
void print();
}
class InterfaceEx implements  printable
{
public void print()
{
System.out.println("hello interface");
}
public static void main(String args[]){
InterfaceEx obj =new InterfaceEx();
obj.print();
}
}
