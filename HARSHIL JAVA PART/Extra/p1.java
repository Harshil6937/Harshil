import java.util.Scanner;
public class p4
{
	public static void main(String v[])
	{
	 Scanner obj=new Scanner(System.in);
	 int n,digit;
	 System.out.println("Enter start number:");
	 n=obj.nextInt();
	while(n>0)
	{
		digit=n%10;
		n=n/10;
		
	 System.out.print(digit);

	}
	 
	}					
}