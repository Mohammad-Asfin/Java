import java.util.*;
public class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Pattern: ");
		int n = sc.nextInt();
		int num = sc.nextInt();


		for (int i = 0; i <= n ; i++)
		{
		int temp = num;
		System.out.println();
			for (int j = 0; j <= n ; j++) 
			{
				System.out.print((j % 2 == 0 + "\t" +  ":" + "\t  " ) );
				temp += 2;
			}
		num += 10;
		System.out.println();
		}
	}
}