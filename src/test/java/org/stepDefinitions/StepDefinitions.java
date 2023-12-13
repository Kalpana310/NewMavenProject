package org.stepDefinitions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
 WebDriver driver;
 @Given("User launch the url")
 public void user_launch_the_url() throws IOException {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
      }

 @When("User enter the credentials")
 public void user_enter_the_userid_and_password() {
	 driver.findElement(By.id("email")).sendKeys("facebook@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("pass@123");
     }
 
 @When("User enter the credentials {string} and {string}")
 public void user_enter_the_credentials_and(String string, String string2) {
	 driver.findElement(By.id("email")).sendKeys(string);
	 driver.findElement(By.id("pass")).sendKeys(string2);  

 }
 
 @When("User enter the credentials {string} and {int}")
 public void user_enter_the_credentials_and(String string, Integer int1) {
	 driver.findElement(By.id("email")).sendKeys(string);
	 driver.findElement(By.id("pass")).sendKeys("int1");  

 }

 
 @When("User click the login button")
 public void user_click_the_login_button() {
	 driver.findElement(By.name("login")).click();
    
 }

 @Then("validate the results")
 public void validate_the_results() {
	driver.close(); 
	     
 }


}
