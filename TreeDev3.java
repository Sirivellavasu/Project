import javax.swing.*;
import javax.swing.tree.*;
class TreeDev3
{
TreeDev3()
{
JFrame F=new JFrame();
DefaultMutableTreeNode f=new DefaultMutableTreeNode("States");
DefaultMutableTreeNode c=new DefaultMutableTreeNode("StateName");
DefaultMutableTreeNode s=new DefaultMutableTreeNode("CapitalCity");
f.add(c);
f.add(s);
DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Karnataka");
DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Telangana");
DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Tamilnadu");
c.add(c1);
c.add(c2);
c.add(c3);
DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Bangalore");
DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Hyderabad");
DefaultMutableTreeNode s3=new DefaultMutableTreeNode("Chennai");
s.add(s1);
s.add(s2);
s.add(s3);
JTree t=new JTree(f);
F.add(t);
F.setSize(300,400);
F.setVisible(true);
}
public static void main(String args[])
{
new TreeDev3();
}
}