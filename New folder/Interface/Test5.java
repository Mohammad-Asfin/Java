interface Calculate  //Functional Interface 
{
	public int sum(int a , int b);
}

class Test5
{
	public static void main(String[]args)
	{
		//Sample s = new Sample();
		Calculate s = new Calculate()
		{
			public int sum(int a , int b)
			{
				int c;
				c = a + b;
				return c;
			}
		};
		int x;
		x = s.sum(10 , 20);
		System.out.println("Result : " + x);
	}
}