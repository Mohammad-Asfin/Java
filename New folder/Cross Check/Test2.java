import java.util.*;
class Test2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Person ID:");
		int pid = sc.nextInt();
		
		System.out.println("Enter the Person Name:");
		String pname = sc.next();
		
		System.out.println("Enter the Person Age:");
		int age = sc.nextInt();
		
		System.out.println("Person ID:" +pid);
		System.out.println("Person Name:" +pname);
		System.out.println("Person Age:" +age);
	}
}