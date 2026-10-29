abstract class Car
{
	public abstract double getavg();
}

class Swift extends Car
{
	public double getavg()
	{
	 return 22.5; 
	}
}

class Innova extends Car
{
	public double getavg()
	{
	 return 28; 
	}
}

public class demo
{
	public static void main(String [] s)
	{
	 Swift s1=new Swift();
	 Innova i1=new Innova();

	 System.out.println(s1.getavg());
	 System.out.println(i1.getavg());
	}
}