package OrangeHRM;

public class UserLoginTC {

//	public static void main(String[] args) {
	void run()
	{
		System.out.println("UserLogin TC");
		System.out.println("----------------------------");
		
		OrangeMethods o=new OrangeMethods();
		String result=o.Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+result);
		
		result=o.Login("Amy.Thomas", "Amythomas1234");
		System.out.println("User Login "+result);
		
		result=o.Logout();
		System.out.println("Logout "+result);
		
		o.Close();
		System.out.println("Closed successfully");

		System.out.println("----------------------------");
	}

}
