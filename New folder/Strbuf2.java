class Strbuf2
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer ("Raju");

		System.out.println("String :" + sb);
		sb.setCharAt(2 , 'm');
		System.out.println("After Set A Character , String :" + sb);
	}
}