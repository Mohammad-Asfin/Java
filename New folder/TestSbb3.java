class TestSbb3
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder ();
		System.out.println("String : " + sb);
		System.out.println("String Length : " + sb.length());
		System.out.println("String Builderr Capacity : " + sb.capacity()); //16

		StringBuilder s1 = new StringBuilder ("xyz");
		System.out.println("String : " + s1);
		System.out.println("String Length : " + s1.length());
		System.out.println("String Builder Capacity : " + s1.capacity()); //16 + 3 = 19

		
		StringBuilder s2 = new StringBuilder ();
		System.out.println("String : " + s2);
		System.out.println("String Length : " + s2.length());
		System.out.println("String Builder Capacity : " + s2.capacity()); //16

		s2.append ("abcdefghlmno");
		System.out.println("After Append -------------------");
		System.out.println("String : " + s2);
		System.out.println("String Length : " + s2.length());
		System.out.println("String Builder Capacity : " + s2.capacity()); //16

		s2.append ("xyz");
		System.out.println("After Append -------------------");
		System.out.println("String : " + s2);
		System.out.println("String Length : " + s2.length());
		System.out.println("String Builder Capacity : " + s2.capacity());
	}
}
