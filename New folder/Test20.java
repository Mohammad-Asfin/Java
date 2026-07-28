import java.io.*;
class Test20
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader x;
		x = new InputStreamReader(System.in);

		BufferedReader y;
		y = new BufferedReader(x);

		String s;
		System.out.print("Enter the string :");
		s = y.readLine();
		System.out.println("The given string is :"+s);
	}
}
