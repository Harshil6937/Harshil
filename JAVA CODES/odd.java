import java.util.Scanner;

public class odd
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	 int n;
	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 for(int i=1;i<=n;i++)
	 {
	  if(!(i%2==0))
	  {
	   System.out.println(i);
	  }
	 }

	}
}