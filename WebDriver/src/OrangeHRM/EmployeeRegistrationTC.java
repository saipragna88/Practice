package OrangeHRM;

public class EmployeeRegistrationTC {

//	public static void main(String[] args)
	void run()
	{
		System.out.println("EmployeeRegistration TC");
		System.out.println("----------------------------");
		
		OrangeMethods o=new OrangeMethods();
		String result=o.Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+result);
		
		result=o.Login("Admin", "admin");
		System.out.println("Login "+result);
		
		result=o.EmployeeRegistration("Amy", "Thomas");
		System.out.println("Employee Registration "+result);
		
		result=o.Logout();
		System.out.println("Logout "+result);
		
		o.Close();
		System.out.println("Closed successfully");
		
		System.out.println("----------------------------");


	}

}
