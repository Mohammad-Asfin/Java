// -------- A.java --------
package samepack; // Both A and B are in the same package "samepack"

public class A
{
	private void show1() // PRIVATE → accessible only inside class A
	{
		System.out.println("Private Method Called");
	}
	public void show2() // PUBLIC → accessible from anywhere
	{
		System.out.println("Public Method Called");
	}
	protected void show3()// PROTECTED → accessible in the same package,
						  // and also in subclasses from other packages
	{
		System.out.println("Protected Method Called");
	}
	void show4() // DEFAULT (package-private) → accessible only within the same package
	{
		System.out.println("Default Method Called");
	}
}