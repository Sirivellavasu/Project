class sup1
{
public void put1()
{
System.out.println("Department Of CS");
}
}
class isup1 extends sup1
{
public void put2()
{
put1();
System.out.println("Rayalaseema University");
}
}
class subb1 extends isup1
{
public void put3()
{
put2();
System.out.println("Kurnool");
}
}
class main39
{
public static void main(String args[])
{
subb1 s1=new subb1();
s1.put3();
}
}