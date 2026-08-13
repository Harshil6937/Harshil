		
import java.util.Scanner;
public class distance
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		double x1,x2,y1,y2,ans;
		
		System.out.println("Enter X1:");
		x1=obj.nextDouble();
		
		System.out.println("Enter X2:");
		x2=obj.nextDouble();

		System.out.println("Enter Y1:");
		y1=obj.nextDouble();

		System.out.println("Enter Y1:");
		y2=obj.nextDouble();

		ans=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

		System.out.println("Distance"+ans);
	}
}