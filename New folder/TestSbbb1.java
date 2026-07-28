class TestSbbb1
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder ("abcdabcdefgh");
		System.out.println("String Length : " + sb.length());
		
		System.out.println("The index number of 'a' : " + sb.indexOf("a"));
		System.out.println("The index number of 'f' : " + sb.indexOf("f"));
		System.out.println("The index number of 'x' : " + sb.indexOf("x"));
		System.out.println("Last index number of 'a' : " + sb.indexOf("a"));
	}
}
