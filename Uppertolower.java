import java.util.*;
class Uppertolower
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s,s1="";
		int i;
		char ch;

		System.out.println("enter the string");
		s=sc.next();

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				s1=s1+(char)(ch+32);
			else
				s1=s1+ch;
		}
		System.out.println(s1);

	}
}