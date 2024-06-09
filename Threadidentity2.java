import java.util.*;
import java.lang.*;
class Threadidentity2 implements Runnable
{
	static Thread t;
	public Threadidentity2(String name)
	{
		Threadidentity2.t=new Thread(this,name);
		Threadidentity2.t.start();
	}
	public void run()
	{
		System.out.println(Threadidentity2.t.getName());
	}	
	
	public static void main(String args[])
	{
		Threadidentity2 ti2=new Threadidentity2("Child");
		
	}
}
		