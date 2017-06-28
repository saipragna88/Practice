package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserReg extends TestngMaster
{
	@Test
	@Parameters({"eName","uName","pswd","cpswd"})
	public void UserRegistration(String eName, String uName, String pswd, String cpswd)
	{
		boolean flag=false;
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(eName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uName);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpswd);
		driver.findElement(By.id("btnSave")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		expVal=uName;
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for(WebElement ele : rows)
		{
			List<WebElement> cells=ele.findElements(By.tagName("td"));
			
			actVal=cells.get(1).getText();
			if(expVal.equals(actVal))
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
			
				
		}
		
		Assert.assertEquals(flag, true);
	}

}
