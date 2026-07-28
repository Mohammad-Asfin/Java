import java.util.*;
class Test27
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Item Number:");
		int ino = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Item Name:");
		String iname = sc1.nextLine();

		System.out.print("Enter the Item Quality:");
		int qty = sc.nextInt();

		System.out.print("Enter the Item Price:");
		float price= sc.nextFloat();

		System.out.println("Item Details:------------");
		System.out.println("Item Number	:"+ino);
		System.out.println("Item Name	:"+iname);
		System.out.println("Item Quality	:"+qty);
		System.out.println("Item Price	:"+price);

	}
}
