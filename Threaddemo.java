import java.io.*;
import java.lang.*;
import java.util.*;
class Morning extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good morning");
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class Evening extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good evening");
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class Threaddemo
{
	public static void main(String args[]) throws Exception
	{
		
		Morning m=new Morning();
		Evening e=new Evening();

		m.start();
		try
		{
		Thread.sleep(50);
		}
		catch(Exception e1)
		{
		}
		e.start();
		System.out.println(m.isAlive());
		System.out.println(e.isAlive());	
		m.join();
		e.join();
		System.out.println(m.isAlive());
		System.out.println(e.isAlive());
		
		System.out.println("good bye");
	}
}