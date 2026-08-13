import java.util.Scanner;
public class sum
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		int n,i=1,ans=0;
		System.out.println("Enter N:");
		n=obj.nextInt();
		while(i<=n)
		{
			ans=ans+i;
			i=i+2;
		}
		System.out.println("Sum is:"+ans);
	}
}
