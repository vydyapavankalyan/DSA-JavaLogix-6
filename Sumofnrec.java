import java.util.*;
class Sumofnrec
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int n=10,result

		result=sum_of_n(n); //calling method
		System.out.println("sum of n natural numbers="+result);

	}

	static int sum_of_n(int n)  //called method
	{
			if(n>0)
			  return(n+sum_of_n(n-1));
			else
			  return n;
	}
		
}