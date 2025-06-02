class ChangingReturn
{
int sum(int a,int b)
{
return(a+b);
}
double sum(double a,double b)
{


return(a+b);
}
public static void main(String args[]){
ChangingReturn obj=new ChangingReturn();
double result=obj.sum(20.5,20.6);
System.out.println(obj.sum(10,10));
System.out.println("result="+result);
}
}

