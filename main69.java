class A
{
protected int idno;
public void get1(int idno)
{
this.idno=idno;
}
public void puts1()
{
System.out.println("id number="+idno);
}
}
class B extends A
{
protected String name;
public void get2(int idno,String name)
{
get1(idno);
this.name=name;
}
public void puts2()
{
puts1();
System.out.println("name="+name);
}
}
class c extends B
{
protected double sal;
public void get3(int idno,String name,int sal)
{
get2(idno,name);
this.sal=sal;
}
public void puts3()
{
puts2();
System.out.println("salary="+sal);
}
}
class main69
{

}
}