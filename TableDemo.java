import javax.swing.*;
public class TableDemo
{
  TableDemo()
{
 JFrame f=new JFrame();
 String data[][]={{"1","kalam","30"},
                  {"1","kalam","30"},
                  {"1","kalam","30"},
                  {"1","kalam","30"}};
String column[]={"ID","NAME","AGE"};
JTable t=new JTable(data,column);
t.setBounds(40,50,200,300);
f.add(t);
f.setSize(400,500);
f.setVisible(true);
}
public static void main(String args[])
{
 new TableDemo();
}
}