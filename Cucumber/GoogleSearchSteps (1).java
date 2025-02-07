package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@When("User types in Cheese and hits ENTER")
	public void user_types_in_cheese_and_hits_enter() {
		WebElement searchBar = driver.findElement(By.id("APjFqb"));
		searchBar.sendKeys("Cheese", Keys.RETURN);
	}

	@Then("Show how many search results were shown")
	public void show_how_many_search_results_were_shown() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls")));
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(Duration.ofSeconds(5));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Result stats: " + resultStats);
	}
	
	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
}
