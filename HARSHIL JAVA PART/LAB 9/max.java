import java.util.Scanner;
public class max
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);

		int a,b,c;
	
		System.out.println("Enter A:");
		a=obj.nextInt();
		System.out.println("Enter B:");
		b=obj.nextInt();
		System.out.println("Enter C:");
		c=obj.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Max");
			}
			else
			{
				System.out.println("C is Max");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Max");
			}
			else 
			{
				System.out.println("C is Max");
			}
		}
		
	}
}