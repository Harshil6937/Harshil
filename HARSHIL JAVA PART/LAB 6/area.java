import java.util.Scanner;
public class area
{
	public static void main()
	{
		Scanner obj=new Scanner(System.in);
		int a;
		int b;
		int c;
		int ans;

		System.out.println("Enter A:");
		a=obj.nextInt();
		System.out.println("Enter B:");
		b=obj.nextInt();
		System.out.println("Enter C:");
		c=obj.nextInt();
		ans=a+b+c;
		System.out.println("Ans is:"+ans);
	}
}