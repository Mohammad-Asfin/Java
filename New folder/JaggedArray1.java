class JaggedArray1 
{
	public static void main(String[] args) 
	{
		int[ ][ ] A = { {30,40,50} , {45} , {50,60} , {5,6,7,8} };
		System.out.println("Irregular Array is");
		for ( int i = 0 ; i < A.length ; i++ )
		{
			System.out.println("\n");
			for ( int j = 0 ; j < A[i].length ; j++ )
			{
				System.out.print(A[i][j] + " \t");
			}
			System.out.println();
		}
	}
}
