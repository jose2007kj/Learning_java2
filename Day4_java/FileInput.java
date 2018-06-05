import java.io.*;
public class FileInput
{
	public static void main(String []args)
	{
		FilesTest one= new FilesTest();
		one.setHeight(10);
		one.setLength(5);
		try
		{
		FileInputStream fs=new FileInputStream("kj.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		FilesTest ar =(FilesTest) os.readObject();
		System.out.println("The type of object is:"+ar.getType());
		}catch(IOException ex)
		{
			ex.printStacktrace();
		}
	}
}