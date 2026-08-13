import java.util.Scanner;
public class extra11
{
	public static void main(String [] s)
	{                                  
		Scanner obj=new Scanner(System.in);
		int n;
		        
		System.out.println("Enter N:");
		n=obj.nextInt();
 
		if(n>=100 && n<=999)
		{
		 System.out.println("Yes Number Is 3 Digit");
		}
		else{
		 System.out.println("Invalid");
		}
	}
}