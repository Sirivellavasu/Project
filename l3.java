import java.awt.*;
import java.applet.*;
/*
<applet code="l3" width=300 height=200>
</applet>
*/
public class l3 extends Applet
{
public static void main(String args[])
{
static final int n=4;
public void init()
{
setLayout(new GridLayout(n,n));
setFont(new Font("Arial",Font.BOLD,24));
int a=1;
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
add(new Button(""+a));
a=a+1;
}
}
}
}
