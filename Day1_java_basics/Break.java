public class Break
{
	public static void main(String []args)
	{
		int []numbers={1,3,5,7,8,13};
		for(int x :numbers)
		{
			System.out.println("number:"+x);
			if(x==7)
			{
				break;
			}
		}
		
	}
}