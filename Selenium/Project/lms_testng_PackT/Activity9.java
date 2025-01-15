package lms_testng_PackT;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity9 {
	
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
	        //String titlenewmyaccountpage=driver.getTitle();
	       // String heading=//driver.findElement(By.className("uagb-ifb-title")).getText();
	        		// String heading=driver.findElement(By.xpath("//*[text()='Email Marketing Strategies']")).getText();
	        		//System.out.println("get heading"+""+heading);
	      // Reporter.log("heading is " + titlenewmyaccountpage + " |");
	        //String title=driver.getTitle();
	      //  Assert.assertEquals(titlenewmyaccountpage,"My Account – Alchemy LMS");
	      //  driver.quit();
	     
	        
	       // driver.findElement(By.linkText("Login")).click();
	       // driver.findElement(By.id("user_login")).sendKeys("root");
	       // driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	       // driver.findElement(By.id("wp-submit")).click();
	        
	        
	        driver.findElement(By.linkText("All Courses")).click();
	       // driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[3]/article/a/img"));
	       // List<WebElement> courses= driver.findElements(By.xpath("//div[@class=\"ld-course-list-items row\"]/div"));
	       // int count = imagesWithSrc.size();
          // System.out.println("Number of <img> elements with a src attribute: " + count);
	       // System.out.println(courses.size());
	        
//String s=driver.findElement(By.xpath("//div[@class=\\\"ld-course-list-items row\\\"]/div/article/a//img[@class='attachment-course-thumb size-course-thumb wp-post-image']")).getAttribute("src");
	  
//System.out.println(s);  

//driver.findElement(By.xpath("//div[@class='ld-course-list-items row']/div/article//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/']")).click();
	// driver.findElement(By.linkText(null))
	        
	       // driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/a/img")).click();
	        driver.findElement(By.xpath("//div[@class='ld-course-list-items row']/div/article/a/img")).click();
	        Thread.sleep(200);
	        //div[@id='ld-status-icon ld-status-incomplete']
	        driver.findElement(By.xpath("//div[@id='ld-status-icon ld-status-incomplete']")).click();
	       Assert.assertEquals(driver.getTitle(),"Social Media Marketing - Alchemy");
	 }
	 
	 
	 
	 @AfterClass
	    public void afterClass() {
	        // Close browser
	        driver.quit();
	    }
	 
	 
}
