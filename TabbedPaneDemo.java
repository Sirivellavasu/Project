import javax.swing.*;
class TabbedPaneDemo
{
  TabbedPaneDemo()
  {
    JTabbedPane Jt=new JTabbedPane();
    JFrame f=new JFrame();
    JPanel p1=new JPanel();
    JLabel l=new JLabel("welcome");
    p1.add(l);
    Jt.add("tabone",p1);
    JPanel p2=new JPanel();
    JTextField t=new JTextField("tabbedpane");
    p2.add(t);
    Jt.add("tabtwo",p2);
    f.add(Jt);
    f.setSize(300,300);
    f.setVisible(true);
    f.setLayout(null);
   }
public static void main(String args[])
{
 new TabbedPaneDemo();
}
}
