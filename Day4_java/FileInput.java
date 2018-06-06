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
			FileOutputStream fs=new FileOutputStream("kj.txt");
			ObjectOutputStream os= new ObjectOutputStream(fs);
			os.writeObject(one);
			os.close();
		}
		catch(Exception ex)
		{
			System.out.println("Exception is:"+ex);
			ex.printStackTrace();
		}
		try
		{
		FileInputStream fs=new FileInputStream("kj.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		FilesTest ar =(FilesTest)os.readObject();
		System.out.println("The value of object is:"+ar.height+ar.length);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}