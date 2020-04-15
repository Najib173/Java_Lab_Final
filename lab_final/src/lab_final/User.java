package lab_final;

public class User {
	protected String userid;
	protected String passwd;
	
	public User(String userid,String passwd)
	{
		this.userid =userid;
		this.passwd =passwd;
	}
	Customer customer = new Customer("Najib", "abc@gmail.com");
	public void dispaly()
	{
		System.out.println("User ID: "+userid);
		System.out.println("User Name: "+customer.getName());
		System.out.println("User Email: "+customer.getEmail());
	}

}
