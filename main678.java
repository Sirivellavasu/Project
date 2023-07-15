import java.io.*;
class main678
{
public static void main(String args[])
{
int a,b,c;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter a and b values");
try
{
a=Integer.parseInt(dis.readLine());
b=Integer.parseInt(dis.readLine());
c=a/b;
System.out.println("result="+c);
}
catch(ArithmeticException ae)
{
System.out.println("division by zero error occurs");
}
catch(ArrayIndexOutOfBoundsException aie)
{
System.out.println("Array is less than actual size");
}
catch(NumberFormatException ne)
{
System.out.println("datatype is mismatch");
}
catch(Exception e)
{
System.out.println("error");
}
}
}