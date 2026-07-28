class StrTest8
{
	public static void main(String[] args) 
	{
		String movie[ ] = { "Temper" , "Devera" , "Rabasa" , "Raki" , "Adhi" ,"Andra Wala" , "Subbi" , "Student No1" , "Janatha Garag" , "Nannaku Prematho" , "Naga"};

		int i;
		boolean x,y;
		
		System.out.println("Movie names starts with 'R' should ends with 'a' : ");
		for ( i = 0 ; i < movie.length ; i++ )
		{
			x = movie[i].startsWith("R");
			y = movie[i].endsWith("a");

			if ( x == true || y == true ) //if ( x || y )
			{
				System.out.println(movie[i]);
			}
		}
	}
}