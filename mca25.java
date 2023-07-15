class childthread extends Thread
{
childthread()
{
 super("child");
System.out.println("child thread Name:"+this);
start();
}
public void run() 
{

 for(int i=101;i<=110;i++)
{
System.out.println("child thread:"+i);
Thread.sleep(500);
throw InterruptedException
}
//catch(InterruptedException e)
{
 //System.out.println("child thread interrupted");
}
//System.out.println("exiting child thread");
}
}
class mca25
{
 public static void main(String args[]) throws InterruptedException
{
 new childthread();
 for(int j=5;j>=0;j--)
{
 System.out.println("main thread:"+j);
 Thread.sleep(1000);
}
}
}
 