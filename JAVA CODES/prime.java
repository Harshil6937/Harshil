import java.util.Scanner;

public class prime
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	 int n,count=0;
	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 for(int i=1;i<=n;i++)
	 {
	  if(n%i==0)
	  {
	   count++;
	  }
	 }
	 
	 if(count==2)
	 {
	  System.out.println("Prime Number");
	 }
	 else
	 {
	  System.out.println("Not Prime");
	 }

	}
}