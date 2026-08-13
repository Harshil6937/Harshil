import java.util.Scanner;
public class table
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		int n,ans;
		int i;
		System.out.println("Enter N:");
		n=obj.nextInt();
		for(i=1;i<=10;i++)
		{
			ans=n*i;
			System.out.println(n+"*"+i+"="+ans);
		}
	}
}