import java.lang.*;
import java.util.*;
class Counter
{
	int count;
	public synchronized void increment()
	{
		count=count+1;
	}
}
class Threadsync
{
	public static void main(String args[]) throws Exception
	{
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		});
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		t1.setName("First Thread");
		t2.setName("Second Thread");

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println(t1.getPriority()); //normal priority
		System.out.println(t2.getPriority()); //normal priority

		t1.setPriority(4);
		t2.setPriority(7);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}
}