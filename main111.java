interface i1
{
public void sum(int x,int y);
}
interface i2 extends i1
{
public void diff(int x,int y);
}
interface i3 extends i2
{
public void prod(int x,int y);
}
class data10 implements i3
{
public void sum(int x,int y)
{
System.out.println("sum="+(x+y));
}
public void diff(int x,int y)
{
System.out.println("difference="+(x-y));
}
public void prod(int x,int y)
{
System.out.println("product="+(x*y));
}
public void display()
{
System.out.println("This is multiple interface class");
}
}
class main111
{
public static void main(String[] args)
{
i3 A=new data10();
A.sum(10,20);
A.diff(40,10);
A.prod(6,8);
data10 D=new data10();
D.display();
}
}