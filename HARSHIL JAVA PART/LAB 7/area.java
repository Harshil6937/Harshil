import java.util.Scanner;
public class area
{
 public static void main(String a[])
 {
	Scanner obj=new Scanner(System.in);
	float s,w,l;
	System.out.println("Enter Side");
	s=obj.nextFloat();
	
	float sarea=s*s;
	float spera=4*s;
	
	System.out.println("Area of square="+sarea); 
	System.out.println("Perameter of square="+spera);


	System.out.println("Enter Length For Rectangle");
	l=obj.nextFloat();
	System.out.println("Enter Width For Rectangle");
	w=obj.nextFloat();
	float rarea=l*w;
	float rpera=2*(l+w); 
	
	System.out.println("Area of Rectangle="+rarea); 
	System.out.println("Perameter of Rectangle="+rpera);

 }
}