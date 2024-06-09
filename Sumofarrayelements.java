import java.util.*;
class Sumofarrayelements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[20];
		int i,n,sum=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		  sum=sum+a[i];

		System.out.println("sum of array a elements="+sum);

	}
}
