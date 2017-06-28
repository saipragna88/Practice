package OrangeHRM;

public class TestSuite {

	public static void main(String[] args) {
		
		LoginTC login=new LoginTC();
		login.run();
		EmployeeRegistrationTC empreg=new EmployeeRegistrationTC();
		empreg.run();
		UserRegistrationTC userreg=new UserRegistrationTC();
		userreg.run();
		UserLoginTC userlogin=new UserLoginTC();
		userlogin.run();

	}

}
