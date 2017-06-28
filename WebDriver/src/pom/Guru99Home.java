package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Home 
{
	@FindBy(xpath="//table/tbody//table//tr[@class='heading3']/td")
	WebElement homepageUsername;
	
	WebDriver driver;
	
	public Guru99Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageUserName()
	{
		return homepageUsername.getText();
	}
	

}
