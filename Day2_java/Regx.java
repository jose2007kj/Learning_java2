import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx
{
	// public static void regex()
	// {
	// 	Pattern
	// }
	public static void main(String []args) throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string in which regx is to be searched:");
		String input=reader.readLine();
		System.out.println("The input text is:"+input);
		String reg ="[A-Za-z]{2,8}";
		Pattern pattern=Pattern.compile(reg);
		Matcher m=pattern.matcher(input);
		if(m.find())
		{
			System.out.println(m.group().trim());
		}
	}
}