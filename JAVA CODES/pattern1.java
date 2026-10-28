import java.util.Scanner;

public class pattern1
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	
	 for(int i=1;i<=5;i++)
	 {
	  for(int j=5;j>=i;j--)
	  {
	   System.out.print("*");
	  }
	  System.out.println();
	 }

	}
}