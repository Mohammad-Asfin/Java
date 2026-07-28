import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Test20
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader x;
		x = new InputStreamReader(System.in);
		
		BufferedReader y;
		y = new BufferedReader(x);
		
		String s;
		System.out.print("Enter the String:");
		s = y.readLine();
		System.out.println("The given string is:" + s);
	}
}