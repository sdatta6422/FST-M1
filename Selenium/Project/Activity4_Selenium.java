package FST_Selenium_Package;

//import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
        String message=driver.getTitle();
        System.out.println(message);
       String msg1=driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
      Color fc=Color.fromString(driver.findElement(By.xpath("//h5[contains[text(),'#5')]")).getCssValue("color"));
      // String msg2=driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getText();
      //  h3
        //h3[text()='Heading #3']
       // String msg2=driver.findElement(By.xpath("//h3[contains(text(),'#5']")).getCssValue("color");
       System.out.println(msg1);
     // System.out.println(msg2);
      
      System.out.println("Color as RGB: " + fc.asRgb());
      System.out.println("Color as hexcode: " + fc.asHex());	
       driver.quit();
        
      

	}

}
