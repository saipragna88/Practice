package OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeMethods {
	
	WebDriver driver;
	String actVal, expVal;
	public String Launch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		expVal="LOGIN";
		actVal= driver.findElement(By.id("btnLogin")).getAttribute("value");
		if(expVal.equals(actVal))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	public String Login(String uname, String pwd)
	{
		expVal="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		actVal=driver.getCurrentUrl();
		if(expVal.equals(actVal))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	public String Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		expVal="LOGIN";
		actVal= driver.findElement(By.id("btnLogin")).getAttribute("value");
		if(expVal.equals(actVal))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	public void Close()
	{
		driver.close();
	}
	
	public String EmployeeRegistration(String fName, String lName)
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		
		expVal=fName+" "+lName;
		actVal=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if(expVal.equals(actVal))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	public String UserRegistration(String eName, String uName, String pwd, String cpwd)
	{
		boolean flag=false;
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(eName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uName);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("btnSave")).click();
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
		if(flag)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

}
