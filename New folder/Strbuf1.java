class Strbuf1
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer ("abcdabCdabcd");

		System.out.println("Sub String - 1 :" + sb.substring(4));
		System.out.println("Sub String - 2 :" + sb.substring(4,8));
	}
}
