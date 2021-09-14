package leafTapsApplication;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadStepDefinition extends LeafApplicationBaseClass{

	@Given("Click on {string}")
	public void clickOnLead(String linkName){
		driver.findElement(By.linkText(linkName)).click();
	}
	
	@Given("Click on Phone tab and enter the {string}")
	public void clickPhoneNumber(String PhoneNumber){
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
	}

	@Given("Click on Find Leads button and select the first row value")
	public void clickFindLeads() throws InterruptedException{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("Click on Submit")
	public void clickSubmit(){
		driver.findElement(By.name("submitButton")).click();
	}
	
	/*@Then("Verify the Portlet name")
	public void portletNameText(){
		String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		String tex1 = "View Lead";
		Assert.assertEquals(text, tex1);
	}*/
}
