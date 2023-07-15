class employee
{
private int empno;
private String ename,designation;
//default constructor
public employee()
{
empno=1;
ename="Raju";
designation="Assistant Professor";
}
//parameterised constructor
public employee(int empno,String ename,String designation)
{
this.empno=empno;
this.ename=ename;
this.designation=designation;
}
public employee(employee EE)
{
empno=EE.empno;
ename=EE.ename;
designation=EE.designation;
}
public void display()
{
System.out.println("employee number="+empno);
System.out.println("employee name="+ename);
System.out.println("Designation="+designation);
}
}
class mainemp
{
public static void main(String args[])
{
employee E=new employee();
E.display();
employee E1=new employee(2,"Dr.M.Rajeswari","Java Lecturer");
E1.display();
employee E2=new employee(E1);
E2.display();
}
}
