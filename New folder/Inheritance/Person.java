//Person.java
import java.util.*;
class Person 
{
	int pid;
	String pname;
	int age;

	void getPerson()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the ID : ");
		pid = sc.nextInt();

		System.out.print("Enter the Name : ");
		pname = sc.next();

		System.out.print("Enter the Age : ");
		age = sc.nextInt();
	}

	void putPerson()
	{
		System.out.println("ID : " + pid);
		System.out.println("Name : " + pname);
		System.out.println("Age : " + age);
	}
}