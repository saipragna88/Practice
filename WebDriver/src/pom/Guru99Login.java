package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login 
{
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	@FindBy(className="barone")
	WebElement titleText;
	
	WebDriver driver;
	
	public Guru99Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public String getLoginTitletext()
	{
		return titleText.getText();
	}
	
	public void loginToGuru99(String uname, String pwd)
	{
		this.setUsername(uname);
		this.setPassword(pwd);
		this.clickLogin();
	}

}
