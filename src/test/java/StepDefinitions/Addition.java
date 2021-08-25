package StepDefinitions;

import org.testng.Assert;

import Pages.CalcPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addition {

	CalcPage calc = new CalcPage(Hooks.driver);
	
	@Given("^Calculator App is open$")
	public void calculator_App_is_open() throws Throwable {
	    Assert.assertTrue(calc.checkIsAppOpen());
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on_number(int n) throws Throwable {
	   calc.clickOnNumber(n);
	   //calc.clickOnNumberByXPATH();
	}

	@Then("^I click on plus sign \"([^\"]*)\"+$")
	public void i_click_on_plus_sign(char sign) throws Throwable {
	    calc.clickOnButton(sign);
	}


	@Then("^I click on Equals to sign \"([^\"]*)\"$")
	public void i_click_on_Equals_to_sign(char sign) throws Throwable {
		calc.clickOnButton(sign);
	}

	@Then("^I will check the \"([^\"]*)\"$")
	public void i_will_check_the(String expected) throws Throwable {
		Assert.assertTrue(calc.checkAnswer(expected));
	}
}
