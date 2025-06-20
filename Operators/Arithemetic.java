import java.util.Scanner;
class Arithemetic{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("sum:"+(a+b));
		System.out.println("subtraction:"+(a-b));
		System.out.println("divison:"+(a/b));
		System.out.println("modulos:"+(a%b));
		System.out.println("multiplication:"+(a*b));
		sc.close();
	}
}