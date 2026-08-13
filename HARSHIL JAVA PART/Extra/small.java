import java.util.Scanner;
public class small
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		
		int a,b,c;

		 System.out.println("Enter A");
		 a=obj.nextInt();

		 System.out.println("Enter B");
		 b=obj.nextInt();

		 System.out.println("Enter C");
		 c=obj.nextInt();

		if(a<b && a<c)
		{
			System.out.println("A is small");
		}
		if(b<a && b<c)
		{
			System.out.println("B is small");
		}
		if(c<b && c<a)
		{
			System.out.println("C is small");
		}
	}
}