package PracT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2_Testng {
	WebDriver driver;
	@BeforeTest
    public void beforeMethod() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
 
        // Open the browser
        driver.get("https://training-support.net/webelements/target-practice");
    }
	
	@Test
    public void testCase1() {
        // This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Selenium: Target Practice");
    }
	
	
	@Test
    public void testCase2() {
        // This test case will Fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
	@Test(enabled = false)
    public void testCase3() {
        // This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
	
	
 
	
	
	 @Test
	    public void testCase4() {
	        // This test will be skipped and will be be shown as skipped
	        throw new SkipException("Skipping test case");
	    }
	 
	// Include alwaysRun property on the @AfterClass to make sure the page always
	    // closes
	    @AfterClass()
	    public void tearDown() {
	        // Close the browser
	        driver.close();
	    }
}
