class Trimsb 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Raju");
		System.out.println("String : " + sb);
		System.out.println("Length of a String : " + sb.length() );
		System.out.println("Capacity of a String : " + sb.capacity() );

		sb.trimToSize();

		System.out.println("After Trim a String Buffer Object .........");
		System.out.println("String  : " + sb);
		System.out.println("Length of a String : " + sb.length() );
		System.out.println("Capacity of a String : " + sb.capacity() );

		sb.append("xyz");
		sb.trimToSize();

		System.out.println("After Trim a String Buffer Object 2nd Time.........");
		System.out.println("String  : " + sb);
		System.out.println("Length of a String : " + sb.length() );
		System.out.println("Capacity of a String : " + sb.capacity() );
	}
}
