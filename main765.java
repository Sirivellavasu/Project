abstract class ab
{
abstract void show();
}
class data extends ab
{
void show()
{
System.out.println("this is abstract class");
}
}
class main765
{
public static void main(String args[])
{
ab A=new data();
A.show();
}
}
