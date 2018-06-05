
	abstract class Bank
	{
		public void deposit()
		{
			System.out.println("hai inside deposits function");
		}
		public void withDraw()
		{
			System.out.println("hai inside withdraw function");
		}
		public abstract int intrestRate();
	}
	class HDFC extends Bank
	{
		@Override
		public int intrestRate(){
			System.out.println("inside hdfc intrestRate fn.");
			return 0;
		}
	}
	class SBI extends Bank
	{
		@Override
		public int intrestRate(){
			System.out.println("inside SBI intrestRate");
			return 0;
		}
	}
	public class AbstractClass
{
	public static void main(String []args){
		Bank hdfc=new HDFC();
		hdfc.deposit();
		hdfc.withDraw();
		hdfc.intrestRate();
		Bank sbi=new SBI();
		sbi.deposit();
		sbi.withDraw();
		sbi.intrestRate();
	}
}