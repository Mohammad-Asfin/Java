class StrTest14
{
	public static void main(String[] args)
	{
		// Original string (Strings are immutable in Java)
		String str = "Nac Computers";
		System.out.println("String : " + str);
		System.out.println("The Hash Code of String  :" + str.hashCode() );
		
		// Convert to lowercase (creates a new string)
		String s1 = str.toLowerCase();
		System.out.println("The given String :" + str);
		System.out.println("The Hash Code of String  :" + str.hashCode() );
		System.out.println("The Hash Code of Lower Case String  :" + s1.hashCode() );

		// Convert to uppercase (creates another new string)
		String s2 = str.toUpperCase();
		System.out.println("The given String :" + str);

		System.out.println("The Hash Code of String  :" + str.hashCode() );
		System.out.println("The Hash Code of Upper Case String  :" + s2.hashCode() );

		// Now, assign the uppercase version back to str
		str = str.toUpperCase();
		System.out.println("------------------");
		System.out.println("The given String :" + str);  // now str holds uppercase string
		System.out.println("The Hash Code of String  :" + str.hashCode() );  // hash code now matches the uppercase version
	}
}