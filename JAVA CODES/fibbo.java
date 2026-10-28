import java.util.Scanner;

public class fibbo
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	
	 int n,a=0,b=1,c;

	 System.out.println("Enter N:");
	 n=obj.nextInt();
	
	 while(a<=n)
	 {
	  System.out.print(a);
	  c=a+b;
	  a=b;
	  b=c;
	 }
	}
}