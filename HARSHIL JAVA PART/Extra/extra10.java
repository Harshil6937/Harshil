import java.util.Scanner;
public class extra10
{
	public static void main(String [] s)
	{
	 Scanner obj=new Scanner(System.in);
	 int a,b,c;

	 System.out.print("Enter A:");
	 a=obj.nextInt();
	 System.out.print("Enter B:");
	 b=obj.nextInt();
	 System.out.print("Enter C:");
	 c=obj.nextInt();

	 if(a==b && b==c && c==a)
	 {
		System.out.println("All Number Are Equal");
	 }
	 else if(a==b && c!=a)
	 {
		System.out.println("A and B are same");
	 }
	 else if(b==c && a!=b)
	 {
		System.out.println("B and C are same");
	 }
	 else if(a==c && b!=a)
	 {
		System.out.println("A and C are same");
	 }
	 else{
		System.out.println("All Are Different");
	 }
	}
}
