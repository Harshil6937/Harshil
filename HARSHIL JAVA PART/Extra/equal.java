import java.util.Scanner;

public class equal  
{
	public static void main(String v[])

	{
		Scanner obj=new Scanner(System.in);

	int a,b,c;
	
	System.out.println("enter a");
	 a=obj.nextInt();
	
	System.out.println("enter b");
	 b=obj.nextInt();

	System.out.println("enter c");
	 c=obj.nextInt();

	if(a==b && b==c)
	
		System.out.println("number is equal");
	
	else if(a==b && b!=c)
	
		System.out.println("number is  a nnd b equal");

	else if(b==c && c!=a)
	
		System.out.println("number is  b nnd c equal");

	else if(a==c && c!=b)
	
		System.out.println("number is  a nnd c equal");
	else
		
		System.out.println("all is not equal");

	}
}


