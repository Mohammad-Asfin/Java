class Test53
{
	public static void main(String[] args) 
	{
		int a;
		a = 1;
		System.out.println("Loop Begins ................");
		while (a <= 10)
		{
			System.out.println("Inside Loop ...................");
			if (a == 5)
			{
				System.out.println("Break the Loop ..................."+a);
				break;
			}
			System.out.println(a);
			a++;
		}
		System.out.println("Loop End .........................");
	}
}