class Even_R_Odd
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Natural Numbers are:");
		a = 1;
		while (a <= 10)
		{
			System.out.print(a + " ");
			a++;
		}
		System.out.println("\n Even Numbers are:");
		a = 2;
		do
		{
			System.out.println(a + " ");
			a = a+2;
		}
		while (a <= 20);
		System.out.println("\n Odd Numbers are:");
		for (a =1;a <= 19;a = a+2 )
		{
			System.out.println(a + " ");
		}
	}
}