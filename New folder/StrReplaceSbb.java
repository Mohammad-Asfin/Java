class StrReplaceSbb 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("abcdabcdabcd");
		System.out.println("String : " + sb);
		System.out.println("Hash Code of String : " + sb.hashCode() );

		sb.replace(0,2 , "xyz");

		System.out.println("After Replace .........");
		System.out.println("String  : " + sb);
		System.out.println("Hash Code of String : " + sb.hashCode() );
	}
}
