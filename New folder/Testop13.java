class Cricket
{
	private int cno;
	String cname,con;

	public void showData()
	{
		System.out.println("Cricketer Number : " + cno);
		System.out.println("Cricketer Name : " + cname);
		System.out.println("Cricketer Country : " + con);
	}
}

class Testop13 
{
	public static void main(String[] args) 
	{
		Cricket c1,c2;
		c1 = new Cricket();
		c2 = new Cricket();
		c1.showData();
		c2.showData();
	}
}
