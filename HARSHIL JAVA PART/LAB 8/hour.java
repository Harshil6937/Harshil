import java.util.Scanner;
public class hour
{
	public static void main(String p[])
	{
		Scanner obj=new Scanner(System.in);

		int s,h,m,rs;

		System.out.println("Enter Seconds");
		s=obj.nextInt();

		h=s/3600;
		rs=s%3600;
		m=rs/60;
		rs=s%60;

		System.out.print(""+h);
		System.out.print(":"+m);
		System.out.print(":"+rs);
	}
}