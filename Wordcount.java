import java.util.*;
class Wordcount
{
public static void main(String args[])
	{
		String s="weclome to satya technologies ameerpet hyderabad";

		int i,count=0;
		char ch;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
			   count++;
		}
		System.out.println("Number of words in a given string="+(count+1));
	}
}