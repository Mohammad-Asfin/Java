import java .util.*;
public class Pattern8
{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Rows:");
		int n = sc.nextInt();

		for ( int i = 1 ; i < n ; i++ )
		{
		System.out.println();
			for ( int j = 1 ; j < n ; j++ )
			{
				System.out.print("\t *  ");
			}
		System.out.println();

		}
	}
}