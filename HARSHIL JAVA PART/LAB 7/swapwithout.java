import java.util.Scanner;
public class swapwithout
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		int a,b;
		System.out.println("Enter A:");
		a=obj.nextInt();
		System.out.println("Enter B:");
		b=obj.nextInt();
		
		System.out.println("Before Swap :" +a + " " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swap :" +a + " " + b);
	}
}