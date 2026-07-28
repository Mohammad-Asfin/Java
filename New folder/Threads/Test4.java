class Sample extends Thread
{
	public void run() //Thread Process
	{
		System.out.println("Child Thread Executed!");
	}
}

class Test4
{
	public static void main(String[]args)
	{
		System.out.println("Main Thread Executed!");
		
		System.out.println("Current Thread Details are: " + Thread.currentThread());

		Sample m = new Sample(); //Thread object creation (Born Thread)
		m.start(); //Thread Object Running
		
		System.out.println("Main Thread Execution Completed!");
	}
}