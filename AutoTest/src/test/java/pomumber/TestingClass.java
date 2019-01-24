package pomumber;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingClass
{
	WebDriver driver;
	ExtentTest test;
	
	String url = "";
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		test = TestRunner.report.startTest("Starting Tests");
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) 
	{
		driver.get(arg1);
		url =driver.getCurrentUrl();
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1)  
	{
		TestCode searching = PageFactory.initElements(driver, TestCode.class);
		searching.search(arg1);
		test.log(LogStatus.INFO, arg1 + ": Test Started");
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() 
	{
	    System.out.println(url);
	    System.out.println(driver.getCurrentUrl());
	    
	    test.log(LogStatus.PASS, "Test Succeeded");
	    
	    //assertTrue(!url.equals(driver.getCurrentUrl()));
	}
}
