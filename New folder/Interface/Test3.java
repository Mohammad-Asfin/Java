interface A  //Functional Interface
{
	public void show();  //Only one public Abstract Method 
}

class Test3
{
	public static void main(String[]args)
	{
		A obj = () -> System.out.println("A Interface , show() Called");
		obj.show();
	}
}