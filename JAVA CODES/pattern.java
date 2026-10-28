import java.util.Scanner;

public class pattern
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	 int n;
	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 for(int i=1;i<=n;i++)
	 {
	  for(int j=1;j<=i;j++)
	  {
	   System.out.print("*");
	  }
	  System.out.println();
	 }

	}
}