class Person
{
	//Data Members
	private int pid,age;
	private String pname;
	
	public Person()
	{
		System.out.println("Constructor is Executed...........(this):" + this.hashCode());
		this.pid = 1;
		this.pname = "Elena";
		this.age = 20;
	}
	public void showPerson()
	{
		System.out.println("Person ID :" + pid);
		System.out.println("Person Name :" + pname);
		System.out.println("Person Age :" + age);
	}
}

class Testop12 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		System.out.println("p1 -> Hash Code :" + p1.hashCode());
		Person p2 = new Person();
		System.out.println("p2 -> Hash Code :" + p2.hashCode());
	}
}
