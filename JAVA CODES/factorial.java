import java.util.Scanner;

public class factorial
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	
	 int n,ans=1;

	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 for(int i=1;i<=n;i++)
	 {
	  ans=ans*i;
	 }

	 System.out.println("Factorial is :"+ans);
	}
}