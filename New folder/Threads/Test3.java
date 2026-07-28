class MyThread extends Thread //Thread creation
{
	public void Run()
	{
		System.out.println("Child Thread Executed!");
	}
}

class Test3
{
	public static void main(String[]args)
	{
		System.out.println("Current Thread Details are: " + Thread.currentThread());
		MyThread m = new MyThread(); //Child thread object creation
		
		System.out.println("Child Thread: " + m);
		m.start(); //Start() Method calls away Run() Method
	}
}
