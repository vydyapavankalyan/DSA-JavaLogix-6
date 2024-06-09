import java.util.*;
import java.io.*;
class Trywitthresources
{
	public static void main(String args[]) throws IOException
	{
		//FileInputStream fis=null;
		try(FileInputStream fis=new FileInputStream("E:sample1.txt"))
		{
			int i;
			while((i=fis.read())!=-1)
				System.out.print((char)i);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
	}
}