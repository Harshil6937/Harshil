import java.util.Scanner;
public class positive
{
	public static void main(String [] s)
	{
	 Scanner obj=new Scanner(System.in);
	 int n;

	 System.out.println("Enter Number");
	 n=obj.nextInt();

	 if(n>0)
	 {
	  System.out.println("Positive Number");
	 }
	 else
	 {
	  System.out.println("Negative Number");
	 }
	}
}