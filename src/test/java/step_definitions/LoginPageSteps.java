package step_definitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageLocators.LoginPage;

public class LoginPageSteps {
	TestContext testContext;
	LoginPage loginPage;
	
	
   public LoginPageSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManger().getLoginPage();
	}
   
   @Given("^user navigates to Orange HRM portal$")
   public void user_navigates_to_Orange_HRM_portal() throws Throwable {
      loginPage.navigateToOrangeHRMPortal();
   }

   @When("^user enter his valid credentials$")
   public void user_enter_his_valid_credentials() throws Throwable {
     loginPage.enterUserName("Admin");
     loginPage.enterPassword("admin123");
   }

   @When("^user clicks on submit button$")
   public void user_clicks_on_submit_button() throws Throwable {
      loginPage.clickSubmitButton();
   }
	
}
