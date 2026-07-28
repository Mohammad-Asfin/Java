import java.util.*;
class Matrix2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		int m,n;
		System.out.print("How many Rows ? :");
		m = sc.nextInt();
		System.out.print("How many columns ? :");
		n = sc.nextInt();
		int [ ][ ]A = new int[m][n];//M X N Matrix
		int r,c;
		System.out.println("Enter the "+ m + "X" + n + "Matrix");
		for ( r = 0 ; r < m ; r++ )
		{
			for ( c = 0 ; c < n ; c++ )
			{
				System.out.print("Enter the number(" + r + "," + c + "):");
				A[r][c] = sc.nextInt();
			}
		}
		System.out.println("\nThe given "+ m + "X" + n + "Matrix:");
		for ( r = 0 ; r < m ; r++ )
		{
			for ( c = 0 ; c < n ; c++ )
			{
				System.out.print(A[r][c] + " ");
			}
			System.out.println();
		}
	}
}