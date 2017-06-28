package OrangeHRM;

public class LoginTC {

//	public static void main(String[] args)
	void run()
	{
		System.out.println("Login TC");
		System.out.println("----------------------------");
		OrangeMethods o=new OrangeMethods();
		String result=o.Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+result);
		
		result=o.Login("Admin", "admin");
		System.out.println("Login "+result);
		
		result=o.Logout();
		System.out.println("Logout "+result);
		
		o.Close();
		System.out.println("Closed successfully");
		
		System.out.println("----------------------------");

	}

}
