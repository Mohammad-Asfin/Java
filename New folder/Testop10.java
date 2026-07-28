class Sample
{
	int a;

	void show()
	{
		System.out.println("This Points to -> " + this.hashCode());
		System.out.println("a :: " + this.hashCode());
	}
}

class Testop10 
{
	public static void main(String[] args) 
	{
		Sample s1,s2;
		s1 = new Sample();
		s2 = new Sample();
		
		System.out.println("s1 - Hash Code : " + s1.hashCode());
		System.out.println("s2 - Hash Code : " + s2.hashCode());

		s1.a = 10;
		s1.show();
		s2.a = 20;
		s2.show();
	}
}
