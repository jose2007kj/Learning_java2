class Jose<T>
{
	T kj;
	public void print()
	{
		System.out.println("the type is:"+kj.getClass().getName());
		System.out.println("the value is:"+kj);
	}
}
public class Generics
{
	public static void main(String []args)
	{
		Jose<String> name=new Jose<>();
		name.kj="Jose kj";
		name.print(); 
		System.out.println("Test 2--------");
		Jose<Integer> test=new Jose<>();
		test.kj=24;
		test.print(); 
	}
}
