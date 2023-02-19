package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	
	//Intractable Mehods
	public void validateAddContactPage() {
		Assert.assertTrue(ADD_CONTACT_HEADER_ELEMENT.isDisplayed(), "Add contact page not found..");
	}
	

}
