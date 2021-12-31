package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createopportunities extends BaseClass {
	@When("Click the New button")
	public void clickNew() {
		driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
		

	}
	@And("Enter the opportunity name")
	public void enterOpportunityName() {
		WebElement opportunityName = driver.findElement(By.xpath("(//input[@name='Name'])[1]"));
		opportunityName.sendKeys("Salesforce Automation by Pradeepkumar N");
		opportunityName.getAttribute("value");
		System.out.println(opportunityName.getAttribute("value"));

	}
	@And("Enter the date")
	public void enterDate() {
		
		driver.findElement(By.xpath("(//input[@name='CloseDate'])[1]")).sendKeys("12/21/2021");
	}
	@When("Click the stage bar")
	public void clickAnalysis() {
		
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[3]"));
		findElement2.click();
	}
	@When("Click the need analysis")
	public void clickNeedAnalysis() {
		driver.findElement(By.xpath("(//span[@class='slds-media__body']/span)[4]")).click();
	}
	@When("Click the save button")
	public void clickSave() {
		
		driver.findElement(By.xpath("(//button[@name='SaveEdit'])")).click();
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
	}
	@Then("Verify the Create opportunities  page")
	public void verifyPage() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		if(title.contains("salesforce Automation by pradeepkumar N")) {
			System.out.println("verified");
		}else {
			System.out.println("other");
		}
	}

}
