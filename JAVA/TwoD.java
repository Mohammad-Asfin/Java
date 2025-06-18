import java .util.*;
public class TwoD
{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Size of Array is 4 X 4");
		System.out.print("---------------------------");

		int A[ ][ ] = new int[4][4];

		for ( int i = 0; i < 4 ; i++ )
		{
		System.out.println();
			for ( int j = 0 ; j < 4 ; j++ )
			{
				System.out.print("Enter the " + (i + 1) + " value: ");
				A[i][j] = sc.nextInt();
			}
		System.out.println();
		}
		
		for ( int i = 0; i < 4 ; i++ )
		{
		System.out.println();
			for ( int j = 0 ; j < 4 ; j++ )
			{
				System.out.print(A[i][j] + "\t");
			}
		System.out.println();
		}
	}
}