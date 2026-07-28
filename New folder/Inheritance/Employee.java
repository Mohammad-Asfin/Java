//Employee.java
import java.util.*;
class Employee extends Person
{
	float sal;

	void getEmp()
	{
		Scanner sc = new Scanner(System.in);
		
		getPerson();
		System.out.print("Enter the Salary : ");
		sal = sc.nextInt();
	}

	void putEmp()
	{
		putPerson();
		System.out.println("Salary : " + sal);
	}
}