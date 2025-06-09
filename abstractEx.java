abstract class Bank{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank{    
int getRateOfInterest()
{
return 7;
}    
}    
class PNB extends Bank
{    
int getRateOfInterest()
{
return 7;
}    
}    
   class TestBank
{    
public static void main(String args[])
{    
Bank b=new SBI();
int interest=b.getRateOfInterest();    
System.out.println("Rate of Interest is: "+interest+" %");    
}
}    
