class VariableEg
{
int num1=200;
int num2=200;
static int Con=500;
void sum( )
{
int R=num1+num2;
System.out.println("Sum="+R);
System.out.println("Static Con="+Con);
}
public static void main(String args[ ])
{
VariableEg obj=new VariableEg();
obj.sum();
}
}


