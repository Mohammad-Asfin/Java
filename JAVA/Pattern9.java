import java .util.*;
public class Pattern9
{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size:");
		int n = sc.nextInt();

		for ( int i = 0 ; i < n ; i++ )
		{
		System.out.println();
			for ( int j = 0 ; j < n ; j++ )
			{
				System.out.print("\t ");
			}
		System.out.println();

		}
	}
}