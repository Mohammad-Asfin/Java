class Employee
{
	private int eid;
	private String ename;
	private int age;
	private float sal;

	public Employee() //Default Constructor....
	{
		eid = 1;
		ename = "Demon";
		age = 29;
		sal = 300000f;

	}
	public Employee(int a, String b, int c, float d)
	{
		eid = a;
		ename = b;
		age = c;
		sal = d;
	}
	public void showData()
	{
		System.out.println("Employee ID: " + eid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Salary: " + sal);
		System.out.println();
	}
}

class Testop15
{
	public static void main(String[] args) 
	{
		Employee e1,e2,e3;
		e1 = new Employee();
		e2 = new Employee(2, "Klaus", 30, 200000.00f);
		e3 = new Employee(3, "Kol" ,31, 100000.00f);
		e1.showData();
		e2.showData();
		e3.showData();
	}
}
