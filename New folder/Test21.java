import java.io.*;
class Test21
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader x = new InputStreamReader(System.in);

		BufferedReader y = new BufferedReader(x);

		String pid;
		System.out.print("Enter the Person id :");
		pid = y.readLine();

		System.out.print("Enter the Person Name :");
		String pname = y.readLine();

		System.out.print("Enter the Person AGE :");
		String age = y.readLine();

		System.out.println("Person Details are:-------------");

		System.out.println("Person ID :" +pid);
		System.out.println("Person NAME :" +pname);
		System.out.println("Person AGE :" +age+"YEARS");
	}
}
