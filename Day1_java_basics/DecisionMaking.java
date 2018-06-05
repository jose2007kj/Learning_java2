import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DecisionMaking
{
	public static void main(String []args) throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++)
		{
			String input=reader.readLine();
			System.out.println(input);
			if(input instanceof String)
			{
				System.out.println("Its a string");

			}
			else{
				System.out.println("Its not a string");				
			}
			switch(input){
				case "hai":
				System.out.println("input given is *****hai****");
				System.out.println("\n");
				break;
				case "hello":
				System.out.println("input typed is ******hello****");
				break;
				default:
				System.out.println("default value");

			}
			try{
				int numbers=Integer.parseInt(input);
				System.out.println("converting to a number format:"+numbers);
				}
			catch(NumberFormatException e)
			{

				System.out.println("Exception*******:"+e);

			}
			// System.out.println(input);	
		}
		
		// int []numbers={1,2,3,4,5,6,7,8,9,10};
		// switch
	}
}