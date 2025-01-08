package FST_Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://training-support.net/webelements/login-form/");
String t=driver.getTitle();
System.out.println(t);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.xpath("//button[text()='Submit']")).click();
String message = driver.findElement(By.tagName("h1")).getText();
System.out.println(message);
driver.quit();

	}

}

