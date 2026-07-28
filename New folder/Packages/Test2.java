//To test a Package
import pack1.Abc;
import pack1.Xyz;
import pack2.Sample;

class Test2
{
	public static void main(String[]args)
	{
		Abc a = new Abc();
		Xyz x = new Xyz();
		Sample s = new Sample();
		
		a.show1();
		x.show2();
		s.show3();
	}
}