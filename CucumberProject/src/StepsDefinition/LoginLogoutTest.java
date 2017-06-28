package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest 
{
	public static WebDriver driver;
	@Given("^Browser opened and application launched$")
	public void browser_opened_and_application_launched() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^tester enters username and password$")
	public void tester_enters_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^display welcome admin message$")
	public void display_welcome_admin_message() throws Throwable {
	    String expval="Welcome Admin";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getText();
	    Assert.assertEquals(expval, actval);
	}

	@When("^tester clicks on welcome admin link$")
	public void tester_clicks_on_welcome_admin_link() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();
		Sleeper.sleepTightInSeconds(3);
		
	}

	@When("^also on Logout$")
	public void also_on_Logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^login page is displayed$")
	public void login_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}



}
