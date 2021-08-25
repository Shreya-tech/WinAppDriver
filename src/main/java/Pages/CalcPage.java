package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.windows.WindowsDriver;

public class CalcPage {
	public WindowsDriver driver;

	// constructor initializing driver.
	public CalcPage(WindowsDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	/*
	 * ---------------------- All Methods
	 */
	public Boolean checkIsAppOpen() {
		Boolean ans = false;
		WebElement check = (WebElement) driver.findElementByAccessibilityId("AppName");
		String value = check.getAttribute("Name");
		if (value.contains("Calculator")) {
			ans = true;
		}
		return ans;
	}

	public void clickOnNumber(int num) {
		driver.findElementByAccessibilityId("num" + num + "Button").click();
	}
	
	public void clickOnNumberByXPATH() {
		driver.findElementByXPath("*//Window[@Name='Calculator'][@ClassName='Windows.UI.Core.CoreWindow']/Group[@ClassName='LandmarkTarget']/Group[@AutomationId='NumberPad'][@Name'Number pad']/Button[@AutomationId='num2Button'][@Name='Two']").click();
	}

	public void clickOnButton(char button) {
		switch (button) {
		case '+':
			driver.findElementByAccessibilityId("plusButton").click();
			break;
		case '=':
			driver.findElementByAccessibilityId("equalButton").click();
			break;
		case '-':
			driver.findElementByAccessibilityId("minusButton").click();
			break;
		}
	}

	public boolean checkAnswer(String num) {
		Boolean ans = false;
		WebElement check = (WebElement) driver.findElementByAccessibilityId("CalculatorResults");
		String value = check.getAttribute("Name");
		if (value.contains("Display is " + num)) {
			ans = true;
		}
		return ans;
	}
}
