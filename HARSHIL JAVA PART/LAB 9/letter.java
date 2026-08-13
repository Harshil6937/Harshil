import java.util.Scanner;
public class letter
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		
		char ch;

		System.out.println("Enter CH:");
		ch=obj.next().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		ch == 'A' ||  ch == 'E' ||  ch == 'I' || ch == 'O' || ch == 'U' )
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");

		}
	}
}