class NewThread implements Runnable
{
Thread t;
New Thread()
{
t=new Thread(this,"child");
System.out.println("child thread Name:"+t);
t.start();
}
public void run()
{
try
{
 for(int i=101;i<=110;i++)
{
system.out.println("child thread:"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
 system.out.println("child thread interrupted");
}
system.out.println("exiting child thread");
}
}
class mca22
{
 public static void main(String args[]) throws InterruptedException
{
 new childThread();
 for(int j=5;j>=0;j--)
{
 system.out.println("main thread:"+j);
 Thread.sleep(1000);
}
}
}
 