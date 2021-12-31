package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonImplementation extends BaseClass{
	
	@Given("Open the browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	    driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}
	@And("Load the url as {string}")
public void launchUrl(String url) {
	driver.get(url);
		

	}
	@And("Enter the username as {string}")

public void userName(String userName) {
	driver.findElement(By.id("username")).sendKeys(userName);
	

}
@And("Enter the password as {string}")
public void passWord(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	

}
@When("Click the login button")
public void clickLogin() {
	driver.findElement(By.id("Login")).click();
	

}
@When("Click the toggle button")
public void clickToggle() {
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
}
@When("Click the view all button")
public void clickViewAll() {
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	

}
@When("Click the  Sales option")
public void clickSales() {
	driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();

}
@When("Click the opportunities tab")
public void clickOpportunities() {
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
    driver.executeScript("arguments[0].click();", opp);

}


}
