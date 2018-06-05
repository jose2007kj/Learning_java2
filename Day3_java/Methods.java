public class Methods
{
	public static void main(String []args)
	{
		int a = 10;
		int b = 11;
		double c =13.3;
		double d =14.4;
		simple(a,b);
		System.out.println("Before swapping:"+a+ " "+b);
		swap(a,b);
		System.out.println("after calling swap function:"+a+ " "+b);
		System.out.println("Calling method overloading");
		int result=min(a,b);
		System.out.println("The minimum of two integers is:"+result);
		double result1=min(c,d);
		System.out.println("The minimum of two double is:"+result1);
	}
	public static void simple(int first,int second)
	{
		System.out.println("The simple function call:"+first +" " +second);
	}
	public static void swap(int first,int second)
	{
		
		System.out.println("inside pass by value swap function and values before swapping is:"+first+ " " +second);
  		int c= first;
  		first = second;
  		second=c;
		System.out.println("after swapping:"+first+" "+second);

	}
	public static int min(int first,int second)
	{
		System.out.println("inside integer minimum function");
		if(first<=second)
		{
			return first;
		}
		else
		{
			return second;
		}

	}
	public static double min(double first,double second)
	{
		System.out.println("inside double minimum function");
		if(first<=second)
		{
			return first;
		}
		else
		{
			return second;
		}
	}

}