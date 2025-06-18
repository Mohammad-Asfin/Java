import java.util.*;
public class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Pattern: ");
		int n = sc.nextInt();

		for (int i = 0; i <= n ; i++)
		{
		System.out.println();
			for (int j = 0; j <= n ; j++) 
			{
				System.out.print((j % 2 == 0 ? "\t1  " : "\t0  " ) );
			}
		System.out.println();
		}
	}
}