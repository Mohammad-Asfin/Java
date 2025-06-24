class StrTest3
{
	public static void main(String[] args) 
	{
		String s = "abcd";  //String Object is Immutable (Non - Changable)
		System.out.println("String : " + s);
		System.out.println("Hash Code of String : " + s.hashCode() );

		s = s + "xyz";
		System.out.println("After Concatentation .......");
		System.out.println("Hash Code of String : " + s.hashCode() );
		System.out.println("String : " + s);

		String s1 = "abcd";
		System.out.println("Hash Code of String : " + s1.hashCode() );
		System.out.println("String : " + s1);
	}
}