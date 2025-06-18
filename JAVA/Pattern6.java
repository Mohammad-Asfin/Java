import java.util.*;
public class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n ; i++)
		{
		System.out.println();
			for (int j = 1; j <= n ; j++) 
			{
				System.out.print("\t  " + num);
				num++;
			}
		System.out.println();
		}
	}
}
