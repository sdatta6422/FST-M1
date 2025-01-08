package FST_Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5_Selenium {
public static void main(String args[])
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://training-support.net/webelements/dynamic-controls");
	String msg=driver.getTitle();
	System.out.println(msg);
	WebElement wec=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
	wec.click();
	 System.out.println("Checkbox is displayed: " + wec.isDisplayed());
	//if(wec.isDisplayed())
		wec.click();
	WebElement wer=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
	 System.out.println("Checkbox is displayed: " + wec.isDisplayed());
	wer.click();
	//if(wer.isDisplayed())
	driver.quit();
		
	
	
	
	
	
}
}
