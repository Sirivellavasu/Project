import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
/* <applet code="EJA" width="300" height="300">
</applet> */
public class EJA extends JApplet implements ActionListener
{
JButton b;
JTextField tf;
public void init()
{
tf=new JTextField();
tf.setBounds(30,40,150,20);
b=new JButton("click");
b.setBounds(30,150,50,30);
add(tf); add(b);
b.addActionListener(this);
setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("welcome");
}
} 
 