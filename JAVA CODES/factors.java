import java.util.Scanner;

public class factors
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	
	 int n;

	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 for(int i=1;i<=n;i++)
	 {
	  if(n%i==0)
	  {
	   System.out.println(i);
	  }
	 }
	}
}