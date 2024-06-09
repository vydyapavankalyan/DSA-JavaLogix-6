import java.util.*;
class Twodimarray
{
	public static void main(String args[])
	{
	     int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
	     

	     for(int[] i:a)
		{
			for(int j:i)
				System.out.print(j+" ");
			System.out.println("");
		}
	}
}		
		