class MyThread implements Runnable
{
	//Declare a string to represent to task
	String str(String str)
	{
		this.str = str;
	}
	public void rin()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(str + " : " + i);
			try
			{
				Thread.sleep(1000);
				//case thread execution for 1000 milliseconds
			}
			catch(InterruptedException ie)
			{ }
		}
	}
}

class Theatre
{
	public static void main(String[]args)
	{
		//Create two objects to represents two tasks
		MyThread obj1 = new MyThread("Cut the ticket");
		MyThread obj2 = new MyThread("Show the ticket");
		
		//Create two threads and attach them to the objects
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Start the threads
		t1.start();
		t2.start();
	}
}