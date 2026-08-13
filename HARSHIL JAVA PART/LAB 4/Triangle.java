public class Triangle
{
	public static void main(String s[])
	{
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		int c=Integer.parseInt(s[2]);

	if(a==b && b==c)
	{
		System.out.println("Equilateral Triangle");	
	}
	
	else if(a==b || b==c || a==c)
	{
		System.out.println("Isosceles Triangle");
	}
	
	else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a )
	{
		System.out.println("Right-angled triangle");
	}
	else
	{
		System.out.println("Scalene Triangle");
	}
	
	}
}