class StrTest1 
{
	public static void main(String[] args) 
	{
		String s1 = "abcd";
		String s2 = "xyz";
		String s3 = "abcd";
		String s4 = "xyz";

		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1: " + s1.hashCode() );

		System.out.println("String - 2 : " + s2);
		System.out.println("Hash Code of String - 2: " + s2.hashCode() );

		System.out.println("String - 3 : " + s3);
		System.out.println("Hash Code of String - 3: " + s3.hashCode() );

		System.out.println("String - 4 : " + s4);
		System.out.println("Hash Code of String - 4: " + s4.hashCode() );
	}
}
