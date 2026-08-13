import java.util.Scanner;
public class circle
{
	public static void main()
	{
		Scanner obj=new Scanner(System.in);
		double r;
		double d;
		int area;

		System.out.println("Enter Area Of Circle");
		area=(int)obj.nextDouble();
		r=Math.sqrt(area / 3.14);	
		d=r/2;
		System.out.println("Diameter is "+d);
	}
}