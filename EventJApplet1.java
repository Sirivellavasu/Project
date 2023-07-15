import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

/* <Applet code= "EventJApplet1" width="300" height="300">
</Applet> */
public class EventJApplet1 extends Applet implements ActionListener
{
JButton b;
JTextField tf;
public void init()
{
tf=new JTextField();
tf.setBounds(30,40,150,20);
b=new JButton("click");
b.setBounds(80,150,70,60);
add(b); add(tf);
b.addActionListener(this);
setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("welcome");
}
}