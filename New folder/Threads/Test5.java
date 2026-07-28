class Natural extends Thread
{
	public void run()
	{
		int i;
		i = 1;
		System.out.print("Natural Numbers	");
		try
		{
			sleep(500);
		}
		catch (InterruptedException x)
		{
		}
		
		while ( i <= 10 )
		{
			System.out.print(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException x)
			{
				System.out.println("Some Interrupted!");
			}
			i++;
		}
	}
}

class Even extends Thread
{
	public void run()
	{
		int i;
		i = 2;
		System.out.println("	Even Numbers");
		try
		{
			sleep(500);
		}
		catch (InterruptedException x)
		{
		}
		
		while ( i <= 20 )
		{
			System.out.println("\t\t\t" + i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException x)
			{
				System.out.println("Some Interrupted!");
			}
			i += 2;
		}
	}
}

class Test5
{
	public static void main(String[]args)
	{
		Natural n = new Natural();
		n.start();
		
		Even e = new Even();
		e.start();
	}
}