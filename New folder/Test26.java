import java.util.*;
class Test26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student Number:");
		int sno = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Student Name:");
		String sname = sc1.nextLine();

		System.out.print("Enter the Maths Marks:");
		int m = sc.nextInt();

		System.out.print("Enter the Physics Marks:");
		int p = sc.nextInt();

		System.out.print("Enter the Chemistry Marks:");
		int c = sc.nextInt();

		System.out.println("Student Marks Details:------------");
		System.out.println("Student Number	:"+sno);
		System.out.println("Student Name	:"+sname);
		System.out.println("Maths Marks	:"+m);
		System.out.println("Physics Marks	:"+p);
		System.out.println("Chemistry Marks	:"+c);

	}
}
