package FST_Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //WebDriver driver=new FirefoxDriver();
    WebDriver driver=new ChromeDriver();
    driver.get("https://training-support.net");
    String title=driver.getTitle();
    driver.findElement(By.linkText("About Us")).click();
    System.out.println(title);
   
	}

}
