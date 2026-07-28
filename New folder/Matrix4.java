import java.util.*;
class Matrix2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		int m1,n1;
		System.out.print("How many Rows for 1st ? :");
		m1 = sc.nextInt();
		System.out.print("How many columns for 1nd ? :");
		n1 = sc.nextInt();

		int m2,n2;
		System.out.print("How many Rows for 2st ? :");
		m2 = sc.nextInt();
		System.out.print("How many columns for 2nd ? :");
		n2 = sc.nextInt();

		int [ ][ ]A = new int[m1][n1];
		int [ ][ ]B = new int[m2][n2];

		int r,c;

		System.out.println("Enter the 1st "+ m1 + "X" + n1 + "Matrix:");
		for ( r = 0 ; r < m1 ; r++ )
		{
			for ( c = 0 ; c < n1 ; c++ )
			{
				System.out.print("Enter the number(" + r + "," + c + "):");
				A[r][c] = sc.nextInt();
			}
		}

		System.out.println("Enter the 2st "+ m2 + "X" + n2 + "Matrix:");
		for ( r = 0 ; r < m2 ; r++ )
		{
			for ( c = 0 ; c < n2 ; c++ )
			{
				System.out.print("Enter the number(" + r + "," + c + "):");
				B[r][c] = sc.nextInt();
			}
		}

		System.out.println("\nThe given 1st "+ m1 + "X" + n1 + "Matrix");
		for ( r = 0 ; r < m1 ; r++ )
		{
			for ( c = 0 ; c < n1 ; c++ )
			{
				System.out.print(A[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("\nThe given 2st "+ m2 + "X" + n2 + "Matrix");
		for ( r = 0 ; r < m2 ; r++ )
		{
			for ( c = 0 ; c < n2 ; c++ )
			{
				System.out.print(B[r][c] + " ");
			}
			System.out.println();
		}
	}
}