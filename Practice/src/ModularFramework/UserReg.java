package ModularFramework;

public class UserReg {

	public static void main(String[] args) {
		OrgMaster om=new OrgMaster();
		System.out.println("Launch "+om.Launch());
		System.out.println("Login "+om.Login("Admin", "admin"));
		System.out.println("User Registration "+om.UserRegistration("ESS", "ddd mmm",
				"dddmmm12345", "Enabled", "dddmmm12345", "dddmmm12345"));
		System.out.println("Logout "+om.Logout());
		om.Close();
		System.out.println("Close");

	}

}
