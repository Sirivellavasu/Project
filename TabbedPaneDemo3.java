import javax.swing.*;
class TabbedPaneDemo3
{
  TabbedPaneDemo3()
  {
    JTabbedPane Jt=new JTabbedPane();
    JFrame f=new JFrame();
    JPanel p1=new JPanel();
    JLabel l=new JLabel("welcome");
    p1.add(l);
    Jt.add("tabone",p1);
    JPanel p2=new JPanel();
    JTextField t=new JTextField("rayalaseema university");
    p2.add(t);
    Jt.add("tabtwo",p2);
    f.add(Jt);
    f.setSize(600,600);
    f.setVisible(true);
    f.setLayout(null);
   }
 public static void main(String args[])
 {
   new TabbedPaneDemo3();
}
}    