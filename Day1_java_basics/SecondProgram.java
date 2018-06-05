class Names{
enum Alias{ jose,kj,jose2007kj};
Alias choice;
}
public class SecondProgram{
	public static void main(String []args)
	{
		Names name=new Names();
		name.choice=Names.Alias.jose2007kj;
		System.out.println("Alias name chossed is: "+name.choice);

	}
}