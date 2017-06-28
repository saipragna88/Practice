package testngDataprovider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EmpReg extends TestngMaster
{
	@Test(dataProvider="data")
	public void EmployeeRegistration(String fName, String lName)
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		
		expVal=fName+" "+lName;
		actVal=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actVal, expVal,"Emp Reg Failed");
		
	}
	
@DataProvider(name="data")
public Object[][] getData()
{
	return new Object[][]{
		{"Siri","K"},
		{"Hari","S"},
		{"Sweta","M"}
		
			};
	}
	
}
