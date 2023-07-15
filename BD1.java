import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code=BD1 width=500 height=400>
</applet>
*/
public class BD1 extends Applet implements ActionListener
{
 public void init()
  {
    Button b1=new Button("Red");
    Button b2=new Button("Green");
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
   }
  public void paint(Graphics g)
   {
     g.drawString("BUTTONDEMO",100,20);
    }
   public void actionPerformed(ActionEvent ae)
    {
      String S=ae.getActionCommand();
       if(S.equals("Red"))
         setBackground(Color.red);
       else
         setBackground(Color.green);
      }
 }