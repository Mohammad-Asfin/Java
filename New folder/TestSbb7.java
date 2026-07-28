class TestSbb7
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("abcdefgh");
		System.out.println("String :" + sb);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String Length :" + sb.length());
		System.out.println();
		
		// a b c d e f g h
		// 0 1 2 3 4 5 6 7 
		sb.deleteCharAt(0);
		System.out.println("String :" + sb);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String Length :" + sb.length());

		// b c d e f g h
		// 0 1 2 3 4 5 6
		sb.deleteCharAt(4);
		System.out.println("String :" + sb);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String Length :" + sb.length());
	}
}