import java.util.*;
class TestStr4
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		String sname;
		System.out.print("Enter the Student Name:");
		sname = sc.nextLine();

		System.out.println("1st Letter is:" + sname.charAt(0));

		System.out.println("2nd Letter is:" + sname.charAt(1) );

		System.out.println("The given name is :" + sname);

		int i;
		for ( i = 0 ; i < sname.length() ; i++ )
		{
			System.out.print(sname.charAt(i));
			Thread.sleep(500); // 500 ms pause
		}
	}
}