import java.util.*;
class Test37
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student Number:");
		int sno = sc.nextInt();
		
		System.out.print("Enter the Student Name:");
		String sname = sc.next();

		System.out.print("Enter the Maths Marks:");
		int m = sc.nextInt();

		System.out.print("Enter the Physics Marks:");
		int p = sc.nextInt();

		System.out.print("Enter the Chemistry Marks:");
		int c = sc.nextInt();

		int total = m + p + c;
		float avg = total/3.0F;

		System.out.println("Student Marks Details:------------");
		System.out.println("Student Number	:"+sno);
		System.out.println("Student Name	:"+sname);
		System.out.println("Maths Marks	:"+m);
		System.out.println("Physics Marks	:"+p);
		System.out.println("Chemistry Marks	:"+c);

		System.out.println("-------------------------------------");
		System.out.println("Total Marks	:"+total);
		System.out.println("Average Marks	:"+avg);
		System.out.println("-------------------------------------");

	}
}
