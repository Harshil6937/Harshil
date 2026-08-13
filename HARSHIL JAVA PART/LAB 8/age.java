import java.util.Scanner;

public class age
{
 public static void main()
 {
	Scanner obj=new Scanner(System.in);
	int by,age;

	System.out.println("Enter Birth Year");
	by=obj.nextInt();

	age=2026-by;
	System.out.println("Age is"+age);
 }
}