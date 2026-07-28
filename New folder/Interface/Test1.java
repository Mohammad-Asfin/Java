interface A  //Functional Interface
{
	public void show();  //Only public Abstract Method
}

class Sample implements A
{
	public void show()
	{
		System.out.println("show() Method Called");
	}
}

class Test1
{
	public static void main(String[]args)
	{
		Sample s = new Sample();
		s.show();
	}
}