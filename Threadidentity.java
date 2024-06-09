import java.util.*;
import java.lang.*;
class Threadidentity extends Thread
{
	public Threadidentity(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(this.getName());
	}	
	
	public static void main(String args[])
	{
		Threadidentity ti=new Threadidentity("Child");
		ti.start();
	}
}
		