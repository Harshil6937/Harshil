import java.util.Scanner;
public class day
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
	
		int days,year,week;
	
		System.out.println("Enter Days");
		days=obj.nextInt();

		year=days / 365;
		days=days % 365;

		week=days/7;
		days=days%7;
	
		System.out.println("Year="+year);
		System.out.println("Week="+week);
		System.out.println("Days="+days);
	}
}