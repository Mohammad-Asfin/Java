class JaggedArray2 
{
	public static void main(String[] args) 
	{
		int [ ][ ]A = new int[4][5];

		A[0][0] = 10;
		A[0][2] = 20;
		A[0][4] = 40;

		A[1][1] = 30;
		A[1][3] = 50;
		A[1][4] = 60;

		A[2][0] = 70;
		A[2][1] = 100;

		A[3][0] = 110;

		System.out.println("Irregular Array is");
		for ( int i = 0 ; i < A.length ; i++ )
		{
			System.out.println("\n");
			for ( int j = 0 ; j < A[i].length ; j++ )
			{
				if ( A[i][j] == 0 )
				{
				System.out.print( "-" + " \t");
				}
				else
				{
					System.out.print(A[i][j] + " \t");
				}
			}
			System.out.println();
		}
	}
}
