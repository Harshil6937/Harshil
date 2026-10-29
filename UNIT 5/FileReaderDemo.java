import java.io.*;

public class FileReaderDemo
{
	public static void main(String []s)
	{
	 FileReader fr=null;

	 try
	 {
	  fr=new FileReader("Charfile.txt");
	  int i;
	  char ch;

	  while((i=fr.read())!=-1)
	  {
	   ch=(char)i;
	   System.out.print(ch);
	  }
	  fr.close();
	 }
	
	
	 catch(Exception e)	
	 {
	  System.out.print("Something Wrong...");
	 }

	
	 
	}
}