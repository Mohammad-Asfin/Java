class Person
{
	private int pid;
	private String pname;
	private int age;

	public Person() //Default Constructor....
	{
		pid = 0;
		pname = "  ";

	}
	public Person(int a, String b, int c)
	{
		pid = a;
		pname = b;
		age = c;
	}
	public void showData()
	{
		System.out.println("Person ID: " + pid);
		System.out.println("Person Name: " + pname);
		System.out.println("Person Age: " + age);
	}
}

class Testop14 
{
	public static void main(String[] args) 
	{
		Person p1,p2,p3;
		p1 = new Person();
		p2 = new Person(2, "Klaus", 30);
		p3 = new Person(3, "Kol" ,31);
		p1.showData();
		p2.showData();
		p3.showData();
	}
}
