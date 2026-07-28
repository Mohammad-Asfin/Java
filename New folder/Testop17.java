class Item
{
	private int ino;
	private String iname;
	private int qty;
	private float price;

	//Constructor Overloading........
	public Item() //Default Constructor
	{
		ino = qty = 0;
		price = 0.0f;
		iname = "----------";
	}
	public Item(int ino,String iname) //2 Argument Constructor
	{
		this.ino = ino;
		this.iname = iname;
		qty = 0;
		price = 0.0f;
	}
	public Item(int ino,String iname,int qty) //3 Argument Constructor
	{
		this.ino = ino;
		this.iname = iname;
		this.qty = qty;
		price = 0.0f;
	}
	public Item(int ino,String iname,int qty,float price) //4 Argument Constructor
	{
		this.ino = ino;
		this.iname = iname;
		this.qty = qty;
		this.price = price;
	}

	public void showItem()
	{
		System.out.println("Item Number :" + ino);
		System.out.println("Item Name :" + iname);
		System.out.println("Item Quantity :" + qty);
		System.out.println("Item Price :" + price);
		System.out.println();
	}
}

class Testop17 
{
	public static void main(String[] args) 
	{
		Item i1 = new Item();
		Item i2 = new Item(1, "Pen");
		Item i3 = new Item(2, "Pencile", 100);
		Item i4 = new Item(3, "Book", 100, 40.35f);

		System.out.println("Item - 1");
		i1.showItem();
		System.out.println("Item - 2");
		i2.showItem();
		System.out.println("Item - 3");
		i3.showItem();
		System.out.println("Item - 4");
		i4.showItem();
	}
}
