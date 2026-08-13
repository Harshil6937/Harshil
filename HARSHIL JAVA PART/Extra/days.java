import java.util.Scanner;
public class days
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);

		int day;

		System.out.println("Enter Days");
		day=obj.nextInt();

		int week=day/7;
		int nday=day%7;

		System.out.print("Week:"+week+"Days:" +nday);
	}
}