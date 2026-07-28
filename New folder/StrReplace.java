class StrReplace 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdabcgh";
		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1: " + s1.hashCode() );

		s1 = s1.replace('b' , 'x');

		System.out.println("After Replace .........");
		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1: " + s1.hashCode() );

		String s2 = "abcdabcgh";
		System.out.println("String - 2 : " + s2);
		System.out.println("Hash Code of String - 2: " + s2.hashCode() );
	}
}