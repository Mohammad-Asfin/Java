class StrTest16
{
	public static void main(String[] args)
	{
		// Character array initialization
		char s[] = {'a' , 'b' , 'c' , 'd' , 'e' , 'f'};

		//System.out.println("Character Array :" + s);
		System.out.println("Character Array is :");
		
		int i;
		for ( i = 0 ; i < s.length ; i++ )
		{
			System.out.print(s[i]); // prints: abcdef
		}

		// Convert character array to String object
		String str = new String(s);
		System.out.println("\nString :" + str);  // prints: abcdef

		// Original String to extract characters from
		String sname = "Nara Chandrababu Naidu";

		// Character array to hold part of the string
		char[] arr = new char[10];

		// Extract first 4 characters ("Nara") from sname into arr
		sname.getChars(0 , 4 , arr , 0);
		System.out.println("Name Array");

		for ( i = 0 ; i < arr.length ; i++ )
		{
			System.out.print(arr[i] + " ");  // prints: N a r a <spaces>
		}
	}
}