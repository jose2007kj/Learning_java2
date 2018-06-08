package com.jose2007kj.classes;
class Q
{
  int q;
  boolean valueset = false;
   public synchronized void put(int num)
  {
  	
  	while(valueset)
  	{
  		try{
  			wait();

  		}
  		catch(Exception e){}
  	}
  	System.out.println("Inside Q"+q);
  	q=num;
  	valueset = true;
  	notify();


  }
   public synchronized void get()
   {
   		while(!valueset)
   		{
   			try{
   				wait();
   			}catch(Exception ex){}
   		}
   		System.out.println("Put value in Q"+q);
   		valueset = false;
   		notify();
   }
}
class Producer implements Runnable{

	Q p;
	public Producer(Q p)
	{
		this.p=p;
		Thread t1 =new Thread(this,"Producer");
		t1.start();
	}
	public void run()
	{
		int i=0;
		while(true){
			p.put(i++);
			try{
				Thread.sleep(1000);
			}catch(Exception ex){}
		}
	}

}
class Consumer implements Runnable{
	Q c;
	public Consumer(Q c)
	{
		this.c = c;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run()
	{
		// int i=0;
		while(true){
			c.get();
			try{
				Thread.sleep(1000);
			}catch(Exception ex){}
		}
	}

}

public class InterThread
{
	public static void main(String []args)
	{
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}