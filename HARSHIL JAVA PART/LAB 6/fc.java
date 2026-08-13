import java.util.Scanner;
public class fc
{
	public static void main()
	{
		Scanner obj=new Scanner(System.in);
	
		float f;
		float c;

		System.out.println("Enter Farenhit");
		f=obj.nextFloat();
		c=(f-32)*5/9;
		System.out.println("Celcius:"+c);
	}
}
