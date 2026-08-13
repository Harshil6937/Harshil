import java.util.Scanner;
public class bmi
{		
	public static void main()
	{
		Scanner obj=new Scanner(System.in);
		
		double w;
		double h;
		double bmi;

		System.out.println("Enter Weight in pounds");
		w= obj.nextDouble();
		System.out.println("Enter Height in inches");
		h= obj.nextDouble();
	
		double kg = w * 0.45359237;
		double me = h * 0.0254;
		
		bmi=kg/me*me;

		System.out.println("BMI IS:"+bmi);		
	}
}