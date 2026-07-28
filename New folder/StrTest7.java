class StrTest7
{
	public static void main(String[] args) 
	{
		String movie[ ] = { "Temper" , "Devera" , "Rabasa" , "Raki" , "Adhi" ,"Andra Wala" , "Subbi" , "Student No1" , "Janatha Garag" , "Nannaku Prematho" , "Naga"};

		int i;
		boolean x;
		
		System.out.println("Movie names starts with 'A' : ");
		for ( i = 0 ; i < movie.length ; i++ )
		{
			x = movie[i].startsWith("A");
			if ( x == true )
			{
				System.out.println(movie[i]);
			}
		}
	}
}