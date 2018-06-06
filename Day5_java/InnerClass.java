
class OuterClass{
	int k;
	class OuterIneer
	{
		void outerInner()
		{
			System.out.println("inside outer inner class");	
		}
		
	}

	void outer()
	{
		OuterIneer oi=new OuterIneer();
		oi.outerInner();
	}
}
public class InnerClass
{


	public static void main(String []args)
	{
		System.out.println("Main class");
		OuterClass oc = new OuterClass();
		oc.outer();
	}
}