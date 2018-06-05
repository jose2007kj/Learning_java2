import java.io.*;

public class FilesTest implements Serializable{
	private int length;
		private int height;
		public void setLength(int length)
		{
			this.length=length;
		}
		public void setHeight(int height)
		{
			this.height=height;
		}

	// public static void main(String ...temp)
	// {

	// 	Files area=new Files();
	// 	area.setHeight(10);
	// 	area.setLength(5);
	// 	try
	// 	{
	// 		FileOutputStream fs=new FileOutputStream("kj.txt");
	// 		ObjectOutputStream os= new ObjectOutputStream(fs);
	// 		os.writeObject(area);
	// 		os.close();
	// 	}
	// 	catch(Exception ex)
	// 	{
	// 		System.out.println("Exception is:"+ex);
	// 		ex.printStackTrace();
	// 	}
	// 	// area = null;
	// 	// try
	// 	// {
	// 	// FileInputStream fs=new FileInputStream("kj.txt");
	// 	// ObjectInputStream os=new ObjectInputStream(fs);
	// 	// Area ar =(Area) os.readObject();
	// 	// System.out.println("The type of object is:"+ar.getType());
	// 	// }catch(Exception ex)
	// 	// {
	// 	// 	ex.printStackTrace();
	// 	// }
		

	// }
}