abstract class bank
{
abstract int getrateofinterest();
}
class SBI extends bank
{
int getrateofinterest()
{
return(8);
}
}
class HDFC extends bank
{
int getrateofinterest()
{
return(7);
}
}
class m4
{
public static void main(String args[])
{
bank B;
B=new SBI();
System.out.println("this is rateofinterest of SBI="+B.getrateofinterest());
B=new HDFC();
System.out.println("this is rateofinterest of HDFC="+B.getrateofinterest());
}
}
