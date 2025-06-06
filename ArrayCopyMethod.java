class ArrayCopyMethod
{
public static void main(String args[])
{
char[] copyFrom={'t','e','j','u','a','s','v','i','n','i'};
char[] copyTo=new char[4];
System.arraycopy(copyFrom, 0 , copyTo , 0, 4);
System.out.println(new String(copyTo));
}
}
