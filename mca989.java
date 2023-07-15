class InvalidAgeException extends Exception
{
public InvalidAgeException(String str)
{
super(str);

}
}
public class mca989
{
static void validate(int age)throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Age is not Valid to Vote");
}
else
{
System.out.println("welcome to vote");
}

}
public static void main(String args[])
{
try
{
validate(13);
}
catch(InvalidAgeException ex)
{
System.out.println("Caught the Exception");
InvalidAgeException object;
System.out.println("Exception Occurred:" +ex);
}
System.out.println("main method....!");
}
}