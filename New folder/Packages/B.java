// -------- B.java --------
package samepack; // Same package as A

public class B
{
	public void show()
	{
		A x = new  A(); // ✅ Works: A is in the same package
		
		x.show1(); // ❌ ERROR: show1() is private → cannot be accessed outside A
		x.show2(); // ✅ OK: public → accessible everywhere
		x.show3(); // ✅ OK: protected + same package → accessible
		x.show4(); // ✅ OK: default + same package → accessible
	}
}