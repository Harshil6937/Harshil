import java.util.Scanner;
public class pos
{
  public static void main(String s[])
  {
	Scanner obj=new Scanner(System.in);
	int n;
	
	System.out.println("Enter N:");
	n=obj.nextInt();

	if(n>0)
	{
		System.out.println("Positive Number");
	}
	if(n<0)
	{
		System.out.println("Negative Number");
	}
	if(n==0)
	{
		System.out.println("Zero");
	}
  } 
}