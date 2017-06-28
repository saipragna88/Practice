package ModularFramework;

public class EmpReg {

	public static void main(String[] args) {
		OrgMaster om=new OrgMaster();
		System.out.println("Launch "+om.Launch());
		System.out.println("Login "+om.Login("Admin", "admin"));
		System.out.println("Employee Registration "+om.EmployeeRegistration("ddd", "mmm"));
		System.out.println("Logout "+om.Logout());
		om.Close();
		System.out.println("Close");
	}

}
