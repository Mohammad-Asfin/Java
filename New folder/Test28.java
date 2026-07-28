import java.io.*;
class Test28 
{
	public static void main(String[] args) 
	{
		Console con = System.console();
		
		int pid;
		System.out.print("Enter Person ID		:");
		pid = Integer.parseInt(con.readLine());

		System.out.print("Enter Person Name	:");
		String pname = con.readLine();

		System.out.print("Enter Person Age	:");
		int age = Integer.parseInt(con.readLine());

		System.out.println("Person Details:------------");
		System.out.println("Person ID	:"+pid);
		System.out.println("Person Name	:"+pname);
		System.out.println("Person Age	:"+age);
	}
}
