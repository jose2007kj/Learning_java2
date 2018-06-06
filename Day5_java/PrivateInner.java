public class PrivateInner
{
	public static void main(String []args)
	{
		OuterClass oc=new OuterClass();
		OuterClass.Inner inner= oc.new Inner();
		System.out.println("returned value is:"+inner.print());
	}
}
class OuterClass
{
	public class Inner
	{	private int num =10;
		public int print()
		{
			System.out.println("yes inside inner");
			return(num);
		}
	}
}