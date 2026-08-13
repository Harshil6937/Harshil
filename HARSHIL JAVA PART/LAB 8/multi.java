import java.util.Scanner;
public class multi
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		
		double a,b,c;

		System.out.println("Enter A:");
		a=obj.nextDouble();

		System.out.println("Enter B:");
		b=obj.nextDouble();

		c=a+b;
		System.out.println("Addition is "+c);
		c=a-b;
		System.out.println("Subtraction is "+c);
		c=a*b;
		System.out.println("Multipication is "+c);	
		c=a/b;
		System.out.println("Divison is "+c);
		
	}
}