class StringBuilderEx
{
public static void main(String args[])
{
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());
StringBuilder sb1 = new StringBuilder("Hello this is StrinBuilder");
System.out.println(sb1);
StringBuilder sb3 = new StringBuilder(40);
System.out.println(sb3.capacity());
}
}
