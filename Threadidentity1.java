import java.util.*;
import java.lang.*;
class Threadidentity1 extends Thread
{
	public Threadidentity1()
	{
		System.out.println(this.getName());
	}
	public void run()
	{
		System.out.println(this.getName());
	}	
	
	public static void main(String args[])
	{
		Threadidentity1 ti1=new Threadidentity1();
		ti1.setName("Child");
		ti1.start();
	}
}
		