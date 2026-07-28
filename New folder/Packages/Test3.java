// Import statements for classes from both packages
import mpack.MyClass1;
import mpack.spack.MyClass2;

class Test3
{
	public static void main(String[]args) // Main method
	{
		// Create object of MyClass1 from package mpack
		MyClass1 m1 = new MyClass1();
		
		// Create object of MyClass2 from nested package mpack.spack
		MyClass2 m2 = new MyClass2();
		
		// Call methods from each class
		m1.myshow1(); // Calls MyClass1's method
		m2.myshow2(); // Calls MyClass2's method
	}
}
