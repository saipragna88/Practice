package OrangeHRM;

public class UserRegistrationTC {

//	public static void main(String[] args) {
	void run()
	{
		System.out.println("UserRegistration TC");
		System.out.println("----------------------------");
		
		OrangeMethods o=new OrangeMethods();
		String result=o.Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+result);
		
		result=o.Login("Admin", "admin");
		System.out.println("Login "+result);
		
		result=o.UserRegistration("Amy Thomas", "Amy.Thomas", "Amythomas1234", "Amythomas1234");
		System.out.println("User Registration "+result);
		
		result=o.Logout();
		System.out.println("Logout "+result);
		
		o.Close();
		System.out.println("Closed successfully");

		System.out.println("----------------------------");
	}

}
