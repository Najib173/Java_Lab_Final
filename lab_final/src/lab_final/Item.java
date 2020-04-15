package lab_final;

public class Item {
	private String itemname;	
	private double price;
	
	public Item (String itemname,double price)	
	{
		this.itemname = itemname;
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("Item Name: "+itemname);
		System.out.println("Item Price: "+price);
	}
}
