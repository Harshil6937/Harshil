import java.lang.Math;
import java.util.Scanner;

public class emi
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		double p,r,n,emi;

		System.out.println("Enter P:");
		p=obj.nextDouble();

		System.out.println("Enter R:");
		r=obj.nextDouble();
		
		System.out.println("Enter N:");
		n=obj.nextDouble();

		emi=p*r*(Math.pow((1+r),n)/Math.pow((1+r),n)-1);

		System.out.println("EMI IS " +emi);

	}

}