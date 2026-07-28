import java.util.*;
class Sample
{
	private int a = 1000;
	private void show1()
	{
		System.out.println("Private Method Called !");
	}

	public void show()
	{
		Scanner sc = new Scanner(System.in);

		int x;
		System.out.println("Public Method Called !");
		System.out.print("Enter Your PIN :");
		x = sc.nextInt();

		if ( x == 1234 )
		{
			show1();
			System.out.println("Private Value : " + a);
		}
		else
		{
			System.out.println("Invalid PIN !");
		}
	}
}
class Testop6
{
	public static void main(String[]args)
	{
		Sample s = new Sample();
		s.show();
		//s.show1();
	}
}