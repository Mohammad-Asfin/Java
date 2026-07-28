class StrTest17
{
	public static void main(String[] args) 
	{
		String str = "1,Roy,Reez,100000";

		// Split string by comma
		String[] s = str.split(",");

		// Corrected loop with valid condition
		for ( int i = 0 ; i < s.length ; i++ )
		{
			System.out.println(s[i]);
		}
	}
}