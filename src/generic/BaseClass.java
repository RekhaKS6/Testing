package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public WebDriver driver;
	public ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("./ExtentReport/report.html");
	public ExtentReports reports = new ExtentReports();
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
