import java.util.*;
class TestArray10
{
	public static void main(String[ ]args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("How many Numbers?:");
		n = sc.nextInt();
		int[] A = new int[n];
		int i;
		for (i = 0;i < A.length;i++)
		{
			System.out.print("Enter the Number:");
			A[i] = sc.nextInt();
		}
		System.out.println("The given numbers are:");
		for (int x : A)
		{
			System.out.print(x + " ");
		}
	}
}