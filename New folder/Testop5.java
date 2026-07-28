class Sample
{
	int a;
	void show1()
	{
		System.out.println("Default Method Called");
	}
}
class Testop5
{
	public static void main(String[]args)
	{
		Sample s = new Sample(); //Object Declaration and Creation (Outside the Class)
		s.a = 10; //Calling Default Member
		System.out.println("a :: d " + s.a);
		s.show1();
	}
}