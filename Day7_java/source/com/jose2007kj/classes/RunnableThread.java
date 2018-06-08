
package com.jose2007kj.classes;
class A implements Runnable
{
	public void run()
	{
		System.out.println("Yes thread a is now executed.....!!!");
		for(int i=0;i<10;i++)
		{
			System.out.println("hallo....."+i);
			try{
				Thread.sleep(1000);
			}catch(Exception ex){

			}
		}
	}
}
class B implements Runnable
{
	public void run(){
		
		System.out.println("Yes thread b is now executed......!!!!");
		for(int i=0;i<10;i++)
		{
			System.out.println("hallo.....B"+i);
		}

	
	}

}
public class RunnableThread
{
	public static void main(String []args)
	{
		Runnable t1 = new A();
		Runnable t2 = new B();
		Thread th1= new Thread(t1);
		th1.start();

		Thread th2 = new Thread(t2);
		th2.start();
	}
}