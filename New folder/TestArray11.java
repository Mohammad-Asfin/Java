import java.util.*;
class TestArray11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		int n;
		System.out.print("How many numbers are ? :");
		n = sc.nextInt();

		int[ ] A = new int[n];
		int i;
		for ( i = 0 ; i < n ; i++ )
		{
			System.out.print("Enter the numbers:");
			A[i] = sc.nextInt();
		}
		
		System.out.println("The given numbers are:");
		for ( i = 0 ; i < n ; i++ )
		{
			System.out.print(A[i]+" ");
		}

		System.out.println("\n The given numbers in Reverse order");
		for ( i = n - 1 ; i >= 0 ; i-- )
		{
			System.out.print(A[i]+" ");
		}
	}
}
