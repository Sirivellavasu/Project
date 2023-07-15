abstract class bike
{
abstract void run();
public void info()
{
System.out.println("Travelling in RoyalEnfield");
}
}
class data1 extends bike
{
void run()
{
System.out.println("Bike Running Safely");
}
}
class main874
{
public static void main(String args[])
{
bike B;
B=new data1();
B.run();
B.info();
}
}