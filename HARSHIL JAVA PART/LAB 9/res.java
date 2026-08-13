import java.util.Scanner;
public class res
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);

		int s1,s2,s3,s4,s5;
		double total,per;

		System.out.println("Enter SUB-1 Mark");
		s1=obj.nextInt();
		System.out.println("Enter SUB-2 Mark");
		s2=obj.nextInt();
		System.out.println("Enter SUB-3 Mark");
		s3=obj.nextInt();
		System.out.println("Enter SUB-4 Mark");
		s4=obj.nextInt();
		System.out.println("Enter SUB-5 Mark");
		s5=obj.nextInt();

		total=s1+s2+s3+s4+s5;
		per=total/5;
	
		System.out.println("Total="+total);
		System.out.println("Per="+per);

		if(per>=90)
		{
			System.out.println("A+ Grade");
		}
		else if(per>=80)
		{
			System.out.println("A Grade");
		}
		else if(per>=70)
		{
			System.out.println("B+ Grade");
		}
		else if(per>=60)
		{
			System.out.println("B Grade");
		}
		else if(per>=50)
		{
			System.out.println("C Grade");
		}
		else if(per>=35)
		{
			System.out.println("P Grade");
		}
		else if(per<35)
		{
			System.out.println("FT");
		}
	}
}