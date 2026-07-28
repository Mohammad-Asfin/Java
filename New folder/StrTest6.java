class StrTest6
{
	public static void main(String[] args) 
	{
		String sname = "Raju";

		boolean x;
		
		x = sname.startsWith("R");
		System.out.println("The given name starts with 'R' : " + x);
		
		x = sname.startsWith("s");
		System.out.println("The given name starts with 's' : " + x );
	}
}