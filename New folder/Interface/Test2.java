interface A  //Functional Interface
{
	public void show();  //Only one public Abstract Method 
}

class Test2
{
	public static void main(String[]args)
	{
		A obj = new A()  //Anonymus inner class(name less class)
		{
			public void show()
			{
				System.out.println("A Interface , show() Called");
			}
		};
		obj.show();
	}
}