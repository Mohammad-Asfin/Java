import java.io.*;
class StrTest12
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		System.out.print("Enter the String : ");
		str = br.readLine();
		String temp = " ";

		char ch;
		int i,x;
		for ( i = 0 ; i < str.length() ; i++ )
		{
			ch = str.charAt(i);
			x = temp.indexOf(ch);
			if ( x == -1 )
			{
				temp = temp + ch;
			}
		}
		System.out.println("The given String is:" + str);
		System.out.println("The Character String is:" + temp);
	}
}