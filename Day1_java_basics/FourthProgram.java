import java.io.*;
public class FourthProgram
{
	int age;
	String name;
	double salary;
	public FourthProgram(String name_1)
	{
		name=name_1;
	}
	public void editAge(int age_1){
		age=age_1;
	}
	public void editSalary(double salary_1)
	{
		salary=salary_1;
	}
	public void printDetails(){
		System.out.println("the age,name,salary is:"+age);
		System.out.println("the name:"+name);
		System.out.println("the salary is:"+salary);
	}
	// public static void main(Sring []args){

	// }
}