import java.io.*;

public class Files
{
	public static void main(String []args) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		FileReader in_file=null;
		FileWriter out_file=null;
		try{
		in = new FileInputStream("input.txt");
		out = new FileOutputStream("output.txt");
		in_file = new FileReader("input_file.txt");
		out_file = new FileWriter("output_file.txt");
		int c,d;
		while((c=in.read())!=-1 && (d=in_file.read())!=-1)
		{
			out.write(c);
			out_file.write(c);

		}
	}
	finally{
		if(in!=null)
		{
			in.close();
			in_file.close();
		}
		if(out!=null)
		{
			out.close();
			out_file.close();
		}
	}
	}
}