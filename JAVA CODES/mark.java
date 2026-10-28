import java.util.Scanner;

public class mark
{
	public static void main(String [] s)
	{
	 Scanner obj=new Scanner(System.in);
	 float s1,s2,s3,s4,s5;

	 System.out.println("Enter Subject 1 Mark");
	 s1=obj.nextFloat();
	
         System.out.println("Enter Subject 2 Mark");
	 s2=obj.nextFloat();
 
	 System.out.println("Enter Subject 3 Mark");
	 s3=obj.nextFloat();

	 System.out.println("Enter Subject 4 Mark");
	 s4=obj.nextFloat();

	 System.out.println("Enter Subject 5 Mark");
	 s5=obj.nextFloat();

	 float total=s1+s2+s3+s4+s5;
	 float per=total/5;

 	 if(per>=60)
	 {
	  System.out.println("First Divison");
	 }
	 else if(per>=50)
	 {
	  System.out.println("Second Divison");
	 }
	 else if(per>=40)
	 {
	  System.out.println("Third Divison");
	 }
	 else 
	 {
	  System.out.println("Fail");
	 }
	}
}