abstract class Test
{
	abstract void test();
}
public class Anonymous
{
	public static void main(String []args)
	{
		Test tes=new Test()
		{
			void test()
			{
				System.out.println("yes inside anonymous class");
			}
		};
		tes.test();

	}
}