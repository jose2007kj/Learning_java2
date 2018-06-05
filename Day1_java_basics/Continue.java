public class Continue
{
	public static void main(String []args)
	{
		int []number={1,2,3,4,5,8,6,7};
		for(int x : number)
		{
			if(x==4)
			{
				continue;
			
			}
				System.out.println("number is:"+x);
		}
	}
}