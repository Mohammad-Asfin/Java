interface A  //Super Class
{
	public void showa();
}
interface B extends A  //Sub Class
{
	public void showb();
}
class Abc implements B
{
	public void showa()
	{
		System.out.println("A interface , showa() Called");
	}
	public void showb()
	{
		System.out.println("B interface , showb() Called");
	}
}

class Test6
{
	public static void main(String[]args)
	{
		Abc x = new Abc();
		x.showa();
		x.showb();
	}
}