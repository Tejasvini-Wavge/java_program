class Operation{
int Square(int n)
{
return n*n;

}

class CircleAggregation
{
Operation op;
double pi=3.14;
double area(int radius)
{
Operation op=new Operation();
int rsquare=op.Square(radius);
return pi*rsquare;
}

public static void main(String args[]){
CircleAggregation c=new CircleAggregation();
double result=c.area(5);
System.out.println(result);
}
}


