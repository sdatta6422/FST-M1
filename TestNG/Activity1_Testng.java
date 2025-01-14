package PracT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1_Testng {
WebDriver driver;

// Setup function
@BeforeClass
public void setUp()
{
	driver=new FirefoxDriver();
	driver.get("https://training-support.net");
}

//Test function
@Test(priority=1)
public void homePageTest()
{
	 // Assert page title
	Assert.assertEquals(driver.getTitle(), "Training Support");
	// Find and click the About page link
	driver.findElement(By.linkText("About Us")).click();
}

@Test(priority = 2)
public void aboutPageTest() {
    // Assert page title
    Assert.assertEquals(driver.getTitle(), "About Training Support");
}

//Teardown function
@AfterClass
public void tearDown() {
    // Close the browser
    driver.quit();
}

}
	



