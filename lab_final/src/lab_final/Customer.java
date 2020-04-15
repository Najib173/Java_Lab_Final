package lab_final;

public class Customer {
	private String name;
	private String email;
	
	public Customer (String name,String email)
	{
		this.name =  name;
		this.email = email;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	
	public static void main(String args[])
	{		
		User user = new User("1","1234");
		Item item = new Item("Book", 124.50);
		
		user.dispaly();
		item.display();
	}
}
