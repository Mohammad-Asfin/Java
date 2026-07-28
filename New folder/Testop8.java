import java.util.*;
class Employee
{
	int eno; //Data Members (accessible to all members within a class)
	String ename;
	Float sal;

	void setEmp(int e,String n,float s)
	{
		//Local Variable Accessible with method only..........
		eno = e;
		ename = n;
		sal = s;
	}
	void putEmp()
	{
		System.out.println();
		System.out.println("Enter the Employee ID	:" + eno);
		System.out.println("Enter the Employee Name	:" + ename);
		System.out.println("Enter the Employee Salary:" + sal);
		System.out.println();
	}
}

class Testop8
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		int eno;
		String ename;
		float sal;

		System.out.print("Enter the Employee Number:");
		eno = sc.nextInt();
		System.out.print("Enter the Employee Name:");
		ename = sc.next();
		System.out.print("Enter the Employee Salary:");
		sal = sc.nextFloat();

		Employee e = new Employee();
		e.setEmp(eno,ename,sal);
		e.putEmp();
		Employee e1 = new Employee();
		e1.setEmp (2 , "Klaus" , 45000.00F);
		e1.putEmp();
	}
}