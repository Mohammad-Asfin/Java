interface Calculate  //Functional Interface 
{
	public int sum(int a , int b);
}

class Test7
{
	public static void main(String[]args)
	{
		Calculate s = (a , b) -> a + b;
		//a,b Parameter and a+b is Return Value
		int x;
		x = s.sum(10 , 20);
		System.out.println("Result : " + x);
	}
}