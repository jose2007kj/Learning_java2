public class Constructors
{
	public static void main(String []args)
	{
		Learning learn=new Learning(10);
		System.out.println("the value is:"+learn.x);

	}
}
class Learning
{
	int x;
	Learning()
	{
		System.out.println("inside the function called with this");
	}
	Learning(int x)
	{
		this();
		this.x=x;
		

	}
}