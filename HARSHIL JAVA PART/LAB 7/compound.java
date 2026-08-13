import java.util.Scanner;
import java.lang.Math;
public class compound
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in); 
		double CI,p,r,n,t;
		System.out.println("Enter P:");
		p=obj.nextDouble();
		System.out.println("Enter R:");
		r=obj.nextDouble();
		System.out.println("Enter N:");
		n=obj.nextDouble();
		System.out.println("Enter T:");
		t=obj.nextDouble();
	
		CI=p*Math.pow((1+(r/100)),n*t);

		System.out.println("CI IS :" +CI );

		double ans=CI-p;
		System.out.println("Profit Is :" +ans );
	}
}