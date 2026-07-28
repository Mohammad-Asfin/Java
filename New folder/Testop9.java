class Person
{
	int pid,age;
	String pname;

	void setPid(int i)
	{
		pid = i;
	}
	void setPname(String p)
	{
		pname = p;
	}
	void setAge(int a)
	{
		age = a;
	}

	int getPid()
	{
		return pid;
	}
	String getPname()
	{
		return pname;
	}
	int getAge()
	{
		return age;
	}
}

class Testop9 
{
	public static void main(String[] args) 
	{
		Person p = new Person();

		p.setPid(1);
		p.setPname("Elena");
		p.setAge(20);

		System.out.println("Person Id : " + p.getPid());
		System.out.println("Person Name : " + p.getPname());
		System.out.println("Person Age : " + p.getAge());
	}
}
