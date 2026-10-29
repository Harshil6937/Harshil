import java.util.Scanner;
public class ExceptionDemo
{
	public static void main(String []s)
	{
	 try
	 {
	  Scanner obj=new Scanner(System.in);
	  int a,b,c;
	  String [] names={"harshil","mayank","krish","shyam","deep"};
 	  
	  System.out.println("Name:"+names[5]);

	  System.out.println("Enter A:");
	  a=obj.nextInt();

 	  System.out.println("Enter B:");
	  b=obj.nextInt();

	  System.out.println("a/b is"+(a/b));
	  System.out.println("End Of Program");
	 }

	 catch(ArithmeticException e)
	 {
	  System.out.println("You can't divide num by zero");
	 }

	 catch(ArrayIndexOutOfBoundsException e)
	 {
	  System.out.println("Array Index Out Of BoUNDS");
	 }

	 catch(Exception e)
	 {
	  System.out.println("Something Wents Wrong.......");
	 }

	 finally
	 {
	  System.out.println("This part always Executes");
	 }
	}
}