public strictfp class StrictFPKeyword
{
public double calculateSum(double a, double b)
{
return a+b;
}
public static void main(String args[])
{
StrictFPKeyword e1=new StrictFPKeyword();
double result=e1.calculateSum(1.010,2.010);
System.out.println("Result:"+result);
}
}
