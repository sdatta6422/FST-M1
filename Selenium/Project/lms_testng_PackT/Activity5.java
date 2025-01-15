package lms_testng_PackT;
//package lms_testng_PackT;
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
public class Activity5 {
	WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        // Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	 }
	 
	 @Test
	 public void start_test() throws InterruptedException
	 {
	        Reporter.log("Starting Test |");
	        // Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	        Reporter.log("Opened Browser |");
	 
	        // Print title of page
	        Thread.sleep(40);
	        
	        driver.findElement(By.linkText("My Account")).click();
	        Thread.sleep(60);
	        String titlenewmyaccountpage=driver.getTitle();
	       // String heading=//driver.findElement(By.className("uagb-ifb-title")).getText();
	        		// String heading=driver.findElement(By.xpath("//*[text()='Email Marketing Strategies']")).getText();
	        		//System.out.println("get heading"+""+heading);
	       Reporter.log("heading is " + titlenewmyaccountpage + " |");
	        //String title=driver.getTitle();
	        Assert.assertEquals(titlenewmyaccountpage,"My Account – Alchemy LMS");
	      //  driver.quit();
	      
	    }

	 @AfterClass
	    public void afterClass() {
	        // Close browser
	        driver.quit();
	    }
}
