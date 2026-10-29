import java.io.*;

public class FileWriterDemo
{
	public static void main(String []s)
	{
	 FileWriter fw=null;

	 try
	 {
	 fw=new FileWriter("Charfile.txt");
	
	 fw.write("Writing Starts Now...");
	
	 for(int i=1;i<=10;i++)
	 {
	  fw.write(i+"\n");
	 }
	 	  fw.close();
	 }

	 catch(Exception e)	
	 {
	  System.out.println("Something Wrong...");
	 }

	
	 
	}
}