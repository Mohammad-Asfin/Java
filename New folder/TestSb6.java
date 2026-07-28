class TestSb6
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("abcdefgh");
		System.out.println("String :" + sb);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String Length :" + sb.length());
		System.out.println();
		
		// a b c d e f g h -> Delete "d e f"
		// 0 1 2 3 4 5 6 7            3 4 5
		sb.delete(3,6); // 3 - beg index , 6 - end index(end - 1)
		System.out.println("String :" + sb);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String Length :" + sb.length());
	}
}
