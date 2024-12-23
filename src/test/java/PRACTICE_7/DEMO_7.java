package PRACTICE_7; //*Scenario outline*
                   //To verify login details or wright or wrong

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DEMO_7 {
	ChromeDriver driver=new ChromeDriver();
	
	@Given("^|I visited tutorialsninja website$")
	public void I_visited_tutorialsninja_website() {
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	}
	@And("^|click myAccount$")
	public void click_myAccount() {
		driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	}
	@When("^|we can see login button and click$")
	public void we_can_see_login_button_and_click() {
		driver.findElement(By.linkText("Login")).click();
	}
	@And("^|enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_username_and_password(String username,String password) {
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	}
	@Then("^|I clicked login button$")
	public void I_clicked_login_button() {
	driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	}
	@And("^|login status with \"([^\"]*)\"$")
	public void login_status_with_login(String login) {
		  System.out.println( "login"+login);
		 // Assert.assertEquals(name, "My Account"); 
		 //Assert.assertEquals(login,"My Account");
	driver.quit();
}
}

