import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
/* <applet code= "EMA" width="300" height="300">
</applet> */
public class EMA extends JApplet implements ActionListener
{
JButton b;
JTextField tf;
public void init()
{
tf=new JTextField();
tf.setBounds(30,40,150,20);
b=new JButton("click");
b.setBounds(30,150,80,30);
add(b); add(tf);
b.addActionListener(this);
setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("welcome");
}
}