package lms_testng_PackT;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity1 {
	WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        // Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	 }
	 
	 @Test
	 public void start_test()
	 {
	        Reporter.log("Starting Test |");
	        // Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	        Reporter.log("Opened Browser |");
	 
	        // Print title of page
	        Reporter.log("Page title is " + driver.getTitle() + " |");
	        String title=driver.getTitle();
	        Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
	      //  driver.quit();
	      
	    }
	 
	 @AfterClass
	    public void afterClass() {
	        // Close browser
	        driver.quit();
	    }
}
