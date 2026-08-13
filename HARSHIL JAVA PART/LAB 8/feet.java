import java.util.Scanner;
public class feet
{
 public static void main(String s[])
 {
	Scanner obj=new Scanner(System.in);
	
	double m,f;

	System.out.print("Enter number in meters:");
	m=obj.nextDouble();
	f=m*3.28084;
	System.out.println("Feet:"+f);
 }
}