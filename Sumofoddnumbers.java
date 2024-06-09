import java.util.*;
class Sumofoddnumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=1;
		do
		{
			sum=sum+i;
			i=i+2;
		}while(i<=n);
			
		System.out.println("sum of odd numbers upto 50="+sum);
	}
}