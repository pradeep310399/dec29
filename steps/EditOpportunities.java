package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditOpportunities extends BaseClass{

   public String attribute;

	
	@When("Search the name in search bar")
	public void searchName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("salesforce Automation by pradeepkumar N",Keys.ENTER);
		Thread.sleep(5000);
		

	}
	@When("Click the dropdown")
public void clickDropdown() throws InterruptedException {
	driver.findElement(By.xpath("(//span[text()='Show Actions']/parent::span)[1]")).click();
	Thread.sleep(5000);

	}
	@When("Click the edit option")
public void clickEdit() {
	driver.findElement(By.xpath("//div[text()='Edit']/parent::a")).click();
	

}
	@Given("Edit the date")
public void editDate() {
	WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	date.clear();
	date.sendKeys("12/22/2021");
	

}
	@And("Edit the analysis")
public void editAnalysis() {
	WebElement findElement2 = driver.findElement(By.xpath("//label[text()='Stage']/following::input[1]"));
	findElement2.click();
	WebElement perceptionanalysis = driver.findElement(By.xpath("//span[contains(@class,'slds-media')]/following::span[text()='Perception Analysis']"));
	perceptionanalysis.click();
	attribute = perceptionanalysis.getAttribute("title");
	System.out.println(attribute);
	

}
	@And("Enter the delivery status")
public void enterDelivery() throws InterruptedException {
	Thread.sleep(8000);
	
		/*
		 * driver.findElement(By.
		 * xpath("(//span[contains(@class,'slds-form')]/following::label[text()='Delivery/Installation Status']/following::div[contains(@class,'slds-form-element__control')])[1]"
		 * )).click();
		 */
	WebElement inProgress = driver.findElement(By.xpath(
			"(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[7]/input"));
	driver.executeScript("arguments[0].click();", inProgress);
Thread.sleep(2000);

		/*
		 * driver.findElement(By.xpath("(//span[@class='slds-media__body'])[13]/span")).
		 * click();
		 */
	driver.findElement(By.xpath("(//span[text()='In progress'])")).click();
	

}
	@And("Enter the description")
public void enterDescription() {
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])")).sendKeys("SalesForce");
	

}
	@When("Click the savebutton")
public void clickSave() {
	driver.findElement(By.xpath("(//button[@name='SaveEdit'])")).click();
	

}
	@Then("Verify the perception analysis")
public void verifyPerception() throws InterruptedException {
		Thread.sleep(6000);
		
		if(attribute.contains("Perception Analysis")) {
			System.out.println("verfied");
		}
		else {
			System.out.println("other");
	

}

	}}
