import java.util.*;
class TestStr2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Name:");
		String fname = sc.next();

		System.out.print("Enter the Middle Name:");
		String mname = sc.next();

		System.out.print("Enter the Last Name:");
		String lname = sc.next();

		String name = fname.concat(" ").concat(mname).concat(" ").concat(lname);

		//String name= fname + " " + mname + " " + lname;

		System.out.println("Name :" + name);
	}
}
