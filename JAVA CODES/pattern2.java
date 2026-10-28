import java.util.Scanner;

public class pattern2
{
	public static void main(String []s)
	{
	 Scanner obj=new Scanner(System.in);
	 int i,j,k;
	 for(i=1;i<=5;i++)
	 {
	  for(j=5;j>i;j--)
	  {
	   System.out.print(" ");
	  }
	  for(k=1;k<=i;k++)
	  {
	   System.out.print(j+" ");//"* "
	  }
	  System.out.println();
	 }

	}
}