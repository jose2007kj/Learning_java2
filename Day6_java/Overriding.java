class A
{
	public void print()
	{
		System.out.println("hai..... inside class A!!!!!");
	}
}
class B extends A
{
	public void print()
	{
		System.out.println("hai inside class B------");
	}
}

public class Overriding
{
	public static void main(String []args)
	{
		A a = new A();
		A b = new B();
		a.print();
		b.print();
	}
}

