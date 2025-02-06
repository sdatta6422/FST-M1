package activities;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static activities.ActionsBase.doSwipe;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Set the Appium server URL
      //  URL serverURL = new URI("http://localhost:4723");
    	URL serverUrl=new URL("http://localhost:4723");

        // Driver Initialization
        driver = new AndroidDriver(serverUrl, options);

        // Open the page in Chrome
        driver.get("https://training-support.net");
    }

    // Test method
    @Test
    public void chromeTest() {
        // Find heading on the page
       
        
       String headingtitleString=driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Training Support\"]")).getText();
      //android.view.View[@text="Training Support"]

        // Print to console
        System.out.println("Heading: " + headingtitleString);

        // Find and click the About Us link
       driver.findElement(By.xpath("//android.view.View[@text=\"About Us\"]")).click();
       
       String aboutustextString= driver.findElement(By.xpath("//android.view.View[@text=\"About Us\"]")).getText();
       System.out.println(aboutustextString);
 
        
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}