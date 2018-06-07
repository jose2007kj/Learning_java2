class Superclass
{
	int z;
	public void add(int x,int y)
	{
		z=x+y;
	}
	public void sub(int x,int y)
	{
		z=x-y;
	}
	public int result()
	{
		return z;
	}
}
public class Inheritance extends Superclass
{
	public static void main(String []args)
	{
		Inheritance in=new Inheritance();
		in.add(2,3);
		System.out.println("the sum is:"+in.result());
		in.sub(3,2);
		System.out.println("the diff is:"+in.result());

	}
}