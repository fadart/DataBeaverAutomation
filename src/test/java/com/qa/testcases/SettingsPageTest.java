package com.qa.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;


public class SettingsPageTest extends TestBase {


	public SettingsPageTest() {
		super();
	}




	@BeforeMethod
	public void setUp(){
		initialization();

	}




	@Test (priority=11)
	public void AddUserTest() throws InterruptedException {
		
		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("AdminEmail_TXT"));
		System.out.println("Admin email passed into text box");		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password_TXT"));
		System.out.println("Admin password passed into text box");

		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Signin button clicked");
		
		driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		System.out.println("settings button clicked");
		
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		System.out.println("New button clicked");
		
		driver.findElement(By.id(OR.getProperty("firstName_ID"))).sendKeys(OR.getProperty("firstName_TXT"));
		System.out.println("first name passed into text box");
		
		driver.findElement(By.id(OR.getProperty("lastName_ID"))).sendKeys(OR.getProperty("lastName_TXT"));
		System.out.println("last name passed into text box");
		
		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password1_TXT"));
		System.out.println("user password passed into text box");
		
		driver.findElement(By.id(OR.getProperty("email1_ID"))).sendKeys("maven1@gmail.com");
		System.out.println("email passed into text box");
		
		driver.findElement(By.id(OR.getProperty("PhonNo_XPATH"))).sendKeys(OR.getProperty("PhonNo_TXT"));
		System.out.println("phone no entered");
		
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect5']")).click();
		System.out.println("gender field  clicked");
		
		
		driver.findElement(By.xpath(OR.getProperty("SubmitBtn_XPATH"))).click();
		System.out.println("submit button clicked");


		if(driver.findElement(By.xpath("//body/npvn-alert[1]"))!= null){
			System.out.println("Success message is present");
		}else{
			System.out.println("Sucess message was absent");}

		Thread.sleep(5000);

	}




	@Test (priority=12)
	public void AddNewAdminTest() throws InterruptedException {
		
		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("AdminEmail_TXT"));
		System.out.println("Admin email passed into text box");		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password_TXT"));
		System.out.println("Admin password passed into text box");

		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Signin button clicked");
		
		driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		System.out.println("settings button clicked");

		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		System.out.println("New button clicked");
		
		driver.findElement(By.id(OR.getProperty("email1_ID"))).sendKeys("maven100@gmail.com");
		System.out.println("email passed into text box");
		

		if(driver.findElement(By.xpath("//body/npvn-alert[1]"))!= null){
			System.out.println("Success message is present");
		}else{
			System.out.println("Sucess message was absent");}

		Thread.sleep(5000);
		


	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}




}
