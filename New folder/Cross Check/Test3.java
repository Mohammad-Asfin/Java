import java.io.*;
class Test29 
{
	public static void main(String[] args) 
	{
		Console con = System.console();
		
		System.out.print("Enter Employee ID	:");
		int eid = Integer.parseInt(con.readLine());

		System.out.print("Enter Employee Name	:");
		String ename = con.readLine();

		System.out.print("Enter Employee Age	:");
		int age = Integer.parseInt(con.readLine());

		System.out.print("Enter Employee Salary	:");
		int salary = Integer.parseInt(con.readLine());

		System.out.println("Employee Details:-------------------");
		System.out.println("Employee ID	:"+eid);
		System.out.println("Employee Name	:"+ename);
		System.out.println("Employee Age	:"+age);
		System.out.println("Employee Salary	:"+salary);
	}
}