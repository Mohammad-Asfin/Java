interface Calculate  //Functional Interface 
{
	public int sum(int a , int b);
}

class Sample implements Calculate  //Implementation class
{
	public int sum(int a , int b)
	{
		int c;
		c = a + b;
		return c;
	}
}

class Test4
{
	public static void main(String[]args)
	{
		Sample s = new Sample();
		int x;
		x = s.sum(10 , 20);
		System.out.println("Result : " + x);
	}
}