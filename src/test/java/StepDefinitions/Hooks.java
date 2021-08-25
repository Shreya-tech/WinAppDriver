package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.windows.WindowsDriver;

public class Hooks {

	public static String wadServerPath;
	public static ProcessBuilder builder;
	public static Process process;

	public static WindowsDriver driver;

//	@BeforeSuite
//	public static void StartWinAppDriver() throws IOException {
//		wadServerPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\WinAppDriver.exe";
//		builder = new ProcessBuilder(wadServerPath).inheritIO();
//		process = builder.start();
//	}

	@Before
	public static void SetDriver() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("platformVersion", "1.0");

		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
	}

	/*
	 * ----------------------- Settings After Test run -----------------------
	 */

	@After(order = 1)
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				// This takes a screenshot from the driver at save it to the specified location
				// File sourcePath = ((TakesScreenshot)
				// testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);

				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File sourcePath = scrShot.getScreenshotAs(OutputType.FILE);

				// Building up the destination path for the screenshot to save
				// Also make sure to create a folder 'screenshots' with in the cucumber-report
				// folder
				File destinationPath = new File(
						System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png");

				// Copy taken screenshot from source location to destination location
				FileUtils.copyFile(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}

		}
	}

	@After(order = 2)
	public static void exitDriver() throws MalformedURLException {
		driver.quit();
	}

//	@AfterSuite
//	public static void EndWinAppDriver() {
//		process.destroy();
//	}
}
