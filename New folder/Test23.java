import java.io.*;
class Test23 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));

		int sno;
		System.out.print("Enter the Student Number:");
		sno = Integer.parseInt(y.readLine());

		System.out.print("Enter the Student Name:");
		String sname = y.readLine();

		System.out.print("Enter the Maths Marks:");
		int m = Integer.parseInt(y.readLine());

		System.out.print("Enter the Physics Marks:");
		int p = Integer.parseInt(y.readLine());

		System.out.print("Enter the Chemistry Marks:");
		int c = Integer.parseInt(y.readLine());

		System.out.println("Student Marks Details:------------");
		System.out.println("Student Number	:"+sno);
		System.out.println("Student Name	:"+sname);
		System.out.println("Maths Marks	:"+m);
		System.out.println("Physics Marks	:"+p);
		System.out.println("Chemistry Marks	:"+c);
	}
}
