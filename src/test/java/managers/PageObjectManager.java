package managers;

import org.openqa.selenium.WebDriver;

import pageLocators.*;

public class PageObjectManager {
	
	private WebDriver driver;

	private LoginPage loginPage;
	
	//To create an object of the pages
	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}
	

	public LoginPage getLoginPage(){
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
}
