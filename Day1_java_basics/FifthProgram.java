import java.io.*;
public class FifthProgram{
	public static void main(String []args){
		FourthProgram one=new FourthProgram("jose");
		FourthProgram two= new FourthProgram("kj");
		one.editSalary(1000.00);
		one.editAge(34);
		one.printDetails();
		two.editSalary(2000.00);
		two.editAge(24);
		two.printDetails();

	}
}