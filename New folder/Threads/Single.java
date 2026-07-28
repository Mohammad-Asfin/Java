class MyThread implements Runnable
{
	public void run()
	{
		task1();
		task2();
		task3();
	}
	
	void task1()
	{
		System.out.println("This is task1");
	}
	void task2()
	{
		System.out.println("This is task2");
	}
	void task3()
	{
		System.out.println("This is task3");
	}
}

class Single
{
	public static void main(String[]args)
	{
		//Create an object to MyThread class
		MyThread m = new MyThread();
		//Create a thread t1 and attach it to that object(MyThread)
		Thread t1 = new Thread(m);
		//Executed the thread t1 on that object run() Method
		t1.start();
	}
} 