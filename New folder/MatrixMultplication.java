import java.util.*;
class MatrixMultplication
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		int m1,n1;
		System.out.print("How many Rows for 1st ? :");
		m1 = sc.nextInt();
		System.out.print("How many columns for 1st ? :");
		n1 = sc.nextInt();

		int m2,n2;
		System.out.print("How many Rows for 2nd ? :");
		m2 = sc.nextInt();
		System.out.print("How many columns for 2nd ? :");
		n2 = sc.nextInt();

		int [ ][ ]A = new int[m1][n1];
		int [ ][ ]B = new int[m2][n2];
		
		int i,j;
		
		if ( n1 != m2 )
		{
			System.out.println("Matrix Multplication is Not Possible ! ");
			System.exit(1);
		}

		// Input for Matrix A
		System.out.println("Enter the 1st "+ m1 + "X" + n1 + "Matrix:");
		for ( i = 0 ; i < m1 ; i++ )
		{
			for ( j = 0 ; j < n1 ; j++ )
			{
				System.out.print("Enter the number(" + i + "," + j + "):");
				A[i][j] = sc.nextInt();
			}
		}

		// Input for Matrix B
		System.out.println("Enter the 2nd "+ m2 + "X" + n2 + "Matrix:");
		for ( i = 0 ; i < m2 ; i++ )
		{
			for ( j = 0 ; j < n2 ; j++ )
			{
				System.out.print("Enter the number(" + i + "," + j + "):");
				B[i][j] = sc.nextInt();
			}
		}

		// Matrix Multplication
		int [ ][ ]C = new int[m1][n2];

        for (i = 0; i < m1; i++)
		{
            for (j = 0; j < n2; j++)
			{
				C[i][j] = 0;
				for ( int k = 0 ; k < n1 ; k++ )
				{
					C[i][j] =  C[i][j] + A[i][k] * B[k][j];
				}
            }
        }
		
		// Display Matrix A
		System.out.println("The given 1st "+ m1 + "X" + n1 + "Matrix");
		for ( i = 0 ; i < m1 ; i++ )
		{
			for ( j = 0 ; j < n1 ; j++ )
			{
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		// Display Matrix B
		System.out.println("The given 2nd "+ m2 + "X" + n2 + "Matrix");
		for ( i = 0 ; i < m2 ; i++ )
		{
			for ( j = 0 ; j < n2 ; j++ )
			{
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		// Display Result Matrix C
		System.out.println("The given Result Matrix is");
		for ( i = 0 ; i < m1 ; i++ )
		{
			for ( j = 0 ; j < n2 ; j++ )
			{
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}