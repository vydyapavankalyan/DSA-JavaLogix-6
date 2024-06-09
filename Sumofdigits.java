import java.util.*;
class Sumofdigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int i,sum=0;
		char ch;

		System.out.println("enter the string");
		s=sc.next();

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+(ch-48);
		}
		System.out.println("sum of all digits of given string="+sum);

	}
}