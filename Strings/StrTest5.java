class StrTest5
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";  //Immutable Object

		StringBuffer s2 = new StringBuffer("Hello");
		String s3 = "abcd";
		String s4 = "xyz";

		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1: " + s1.hashCode() );

		System.out.println("String - 2 : " + s2);
		System.out.println("Hash Code of String - 2: " + s2.hashCode() );

		s1 = s1 + "xyz";
		s2 = s2.append("xyz");  //append concat ,+ not works

		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1: " + s1.hashCode() );

		System.out.println("String - 2 : " + s2);
		System.out.println("Hash Code of String - 2: " + s2.hashCode() );
	}
}