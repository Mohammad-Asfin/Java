class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Child Thread Executed");
	}
}

class Test6
{
	public static void main(String[]args)
	{
		System.out.println("Main Thread Begins . . . . . . .");
		System.out.println("Main Thread Details:" + Thread.currentThread());
		
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		
		t.start();
		System.out.println("Main Thread Ends . . . . . . . .");
	}
}