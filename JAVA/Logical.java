public class Logical
{
	public static void main(String ... args)
	{
		Boolean a,b;
		a = 15;
		b = 25;
		System.out.println(a + "&&" +b+ ":" + (a && b));
		System.out.println(a + "||" +b+ ":" + (a || b));
		System.out.println(a + "!" +b+ ":" + (a ! b));
	}
}