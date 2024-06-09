import java.util.*;
class Towersofhanoi
{
	public static void main(String args[])
	{
		toh(5,1,2,3);
	
	}
	static void toh(int n,int A,int B,int C)
		{
			if(n>0)
			{
				toh(n-1,A,C,B);
				System.out.println("Move disc from"+A+"to"+C);
				toh(n-1,B,A,C);
			}
		}
}