import java.util.*;
public class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n ; i++)
		{
		System.out.println();
			for (int j = 1; j <= 6 ; j++) 
			{
				System.out.print("\t  " + j);
			}
		System.out.println();
		}
	}
}
