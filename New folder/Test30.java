import java.io.*;
class Test28 
{
	public static void main(String[] args) 
	{
		Console con = System.console();
		
		System.out.print("Enter User Name	:");
		String uname = con.readLine();

		System.out.print("Enter Password	:");
		char[] p = con.readPassword();
		String pwd = new String(p); //Chat array to string conversion

		System.out.println("User Details:------------");
		System.out.println("User Name	:"+uname);
		System.out.println("Password	:"+pwd);
	}
}
