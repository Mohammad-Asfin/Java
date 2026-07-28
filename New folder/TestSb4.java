class TestSb1
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(20);
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String :" + sb);
		System.out.println("String Length :" + sb.length());
		System.out.println("Hash Code of String :" + sb.hashCode());
		System.out.println();

		sb.append("abcdefghijklmnopqrstuvwxyz");
		System.out.println("String Capacity :" + sb.capacity());
		System.out.println("String :" + sb);
		System.out.println("String Length :" + sb.length());
		System.out.println("Hash Code of String :" + sb.hashCode());
		System.out.println();

		sb.append(2345);
		System.out.println("String :" + sb);
		System.out.println();

		sb.append(true);
		System.out.println("String :" + sb);
		System.out.println();

		sb.append(12.345F);
		System.out.println("String :" + sb);
		System.out.println("Hash Code of String :" + sb.hashCode());
	}
}
