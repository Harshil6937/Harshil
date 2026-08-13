import java.util.Scanner;
public class per
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		
		int s1,s2,s3,s4,s5;
		float total,per;

		System.out.println("Enter Mark Sub-1:");
		s1=obj.nextInt();
		System.out.println("Enter Mark Sub-2:");
		s2=obj.nextInt();
		System.out.println("Enter Mark Sub-3");
		s3=obj.nextInt();
		System.out.println("Enter Mark Sub-4");
		s4=obj.nextInt();
		System.out.println("Enter Mark Sub-5:");
		s5=obj.nextInt();

		total=s1+s2+s3+s4+s5;
		per=total/5;

		System.out.println("Total is"+total);
		System.out.println("Per is"+per);
	}
}