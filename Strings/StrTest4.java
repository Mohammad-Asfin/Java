class StrTest4
{
	public static void main(String[] args) 
	{
		String s1 = "abcd";

		String s2 = new String("abcd");

		char[ ] A = { 'a' , 'b' , 'c' ,'d' , 'e' , 'f' };
		String s3 = new String(A,0,4); //Character array to String Conversion ........

		System.out.println("String - 1 : " + s1);
		System.out.println("String - 2 : " + s2);
		System.out.println("String - 3 : " + s3);

		System.out.println("Hash Code of String - 1: " + s1.hashCode() );
		System.out.println("Hash Code of String - 2: " + s2.hashCode() );
		System.out.println("Hash Code of String - 3: " + s3.hashCode() );
	}
}