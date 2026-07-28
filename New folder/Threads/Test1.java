//Let us find current thread
class Test1
{
	public static void main(String[]args)
	{
		System.out.println("Hello World");
		Thread t = new Thread();
		System.out.println("Current : " + t);
	}
}