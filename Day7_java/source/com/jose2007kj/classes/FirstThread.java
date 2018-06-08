package com.jose2007kj.classes;
class A extends Thread
{
	public void run(){
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
class B extends Thread
{
	public void run()
	{
		System.out.println("Yes thread b is now executed......!!!!");
		for(int i=0;i<10;i++)
		{
			System.out.println("hallo.....B"+i);
		}

	}
}
public class FirstThread
{
	public static void main(String []args)
	{
		System.out.println("Welcome to main thread ");
		A a=new A();
		a.start();
		B b =new B();
		b.start();
}
}