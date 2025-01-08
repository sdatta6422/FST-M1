package FST_Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		String t=driver.getTitle();
		System.out.println(t);
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		//driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//String message = driver.findElement(By.tagName("h1")).getText();
		//String message=
		String message=driver.findElement(By.xpath("//h1[contains(text(),'Success')]")).getText();
		
		//h1[contains(text(),'Success')]
		System.out.println(message);
		driver.quit();
	}

}
