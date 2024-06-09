import java.util.*;
class Vowelorconsonant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.println("it is a vowel");
		else
		System.out.println("it is a consonant");
	}
}