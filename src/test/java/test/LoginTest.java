package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSininButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
		
	}

}
