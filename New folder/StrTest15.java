import java.util.*;
class StrTest15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String city[] = {"Machilipatnam" , "Vijaywada" , "Challapali" , "MTM City"};
		String cname;
		System.out.print("Enter the City Name:");
		cname = sc.nextLine();  //String cname = sc.nextLine().trim();
		cname = cname.trim(); //trim thr space befor and after the string

		int i;
		boolean f = false;
		for ( i = 0 ; i < city.length ; i++ )
		{
			// Case-insensitive comparison (recommended for user input)
			if (city[i].equalsIgnoreCase(cname)) //if ( city [i].equals(cname) == true)
			{
				f = true;
				break;
			}
		}

		// Final output
		if ( f == true )
		{
			System.out.println("Delivery Point Is Available In Your City!");
		}
		else 
		{
			System.out.println("Delivery Point Is Not Available In Your City!");
		}
	}
}