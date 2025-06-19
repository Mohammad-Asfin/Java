import java.util.*;
public class DataTypes
{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//Initilizint all values
		System.out.print("Enter the Byte value:");
		byte b = sc.nextByte();

		System.out.print("Enter the Short value:");
		short s = sc.nextShort();

		System.out.print("Enter the Integer value:");
		int i = sc.nextInt();
		
		System.out.print("Enter the Float value:");
		float f = sc.nextFloat();

		System.out.print("Enter the Double value:");
		double d = sc.nextDouble();

		System.out.print("Enter the Character value:");
		char c = sc.next().charAt(0);

		
		//Display all values
		System.out.println("Byte :" + b);
		System.out.println("Short :" + s);
		System.out.println("Integer :" + i);
		System.out.println("Float :" + f);
		System.out.println("Double :" + d);
		System.out.println("Character :" + c);
	}
}