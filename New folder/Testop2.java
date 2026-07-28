import java.util.*;
class Employee
{
	int eid;
	String ename;
	int sal;

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Employee ID	:");
		eid = sc.nextInt();

		System.out.print("Enter the Employee Name	:");
		ename = sc.next();

		System.out.print("Enter the Employee Salary:");
		sal = sc.nextInt();

		System.out.println();
	}

	void Display()
	{
		System.out.println("Employee ID	:" + eid);
		System.out.println("Employee Name	:" + ename);
		System.out.println("Employee Salary :" + sal);

		System.out.println();
	}
}

class Testop2
{
	public static void main(String[]args)
	{
		Employee e1;
		e1 = new Employee();
		Employee e2,e3;
		e2 = new Employee();
		e3 = new Employee();

		e1.accept();
		e2.accept();
		e3.accept();

		e1.Display();
		e2.Display();
		e3.Display();
	}
}