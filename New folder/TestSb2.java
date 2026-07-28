class TestSb2
{
	public static void main(String[] args) 
	{
		String s1 = "nac";
		System.out.println("String : " + s1);
		System.out.println("Hash Code of String : " + s1.hashCode() );

		s1 = s1 + "computers";
		System.out.println("String - 1 : " + s1);
		System.out.println("Hash Code of String - 1 : " + s1.hashCode() );

		StringBuffer s2 = new StringBuffer("abc");
		System.out.println("String - 2 : " + s2);
		System.out.println("Hash Code of String - 2 : " + s2.hashCode() );

		s2.append("computers");
		System.out.println("String - 2 : " + s1);
		System.out.println("Hash Code of String - 1 : " + s1.hashCode() );
	}
}
