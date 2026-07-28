class TestArray7 
{
	public static void main(String[] args) 
	{
		String[ ] s = {"Raju","Ramu","Sureh","Ramesh"};
		System.out.println("The given names are:");
		for (int i = 0;i < 4;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("The given names are:");
		for (String t : s)
		{
			System.out.println(t + " ");
		}
	}
}
