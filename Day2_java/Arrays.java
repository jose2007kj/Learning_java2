public class Arrays{
	public static void list(int[] array)
	{
		for(int x : array){
			System.out.println("inside simple function call:"+x);
		}

	}
	public static int[] passingArray(int[] array2)
	{
		int[] temp=new int[array2.length];
		// int i=0;
			for (int i=0,j=array2.length-1;i<array2.length;j--,i++)
			{
				temp[i]=array2[j];
				// i++;
			}
		return temp;
	}
	public static void main(String []args)
	{
		int[] marks={60,65,70,80,90,69};
		int[] rev= new int[marks.length];
		for (int y : marks)
		{   if(y>=90)
			{
				System.out.println("you got a distinction!!!");
				list(marks);
			}
			else if(y< 90 && y>=80)
			{
				System.out.println("you got a 80+...congrats");
				rev=passingArray(marks);

			}
			else if(y<80 && y>=70)
			{
				System.out.println("you got a 70+..... congrats!!!");
			}
			else
			{
				System.out.println("you got a 60+..... congrgulations");
			}
			
		}
		for(int k : rev)
			{
				System.out.println("rev number:"+k);
			}
	}
}