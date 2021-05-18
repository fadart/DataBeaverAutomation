package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;


public class RegisterPageTest extends TestBase {


	public RegisterPageTest() {
		super();
	}




	@BeforeMethod
	public void setUp(){
		initialization();

	}


	@Test (priority = 1)
	public void RegisterPageETest() {
		
		driver.findElement(By.xpath(OR.getProperty("Register_XPATH"))).click();
		System.out.println("Register button clicked");
		
		driver.findElement(By.id(OR.getProperty("firstName_ID"))).sendKeys(OR.getProperty("firstName_TXT"));
		System.out.println("first name passed into text box");
		
		driver.findElement(By.id(OR.getProperty("lastName_ID"))).sendKeys(OR.getProperty("lastName_TXT"));
		System.out.println("last name passed into text box");
		
		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password1_TXT"));
		System.out.println("user password passed into text box");
		
		driver.findElement(By.id(OR.getProperty("email1_ID"))).sendKeys(OR.getProperty("email1_TXT"));
		System.out.println("email passed into text box");
		
		driver.findElement(By.id(OR.getProperty("PhonNo_XPATH"))).sendKeys(OR.getProperty("PhonNo_TXT"));
		System.out.println("phone no entered");
		
		driver.findElement(By.id(OR.getProperty("PassW_XPATH"))).sendKeys(OR.getProperty("PassW_TXT"));
		System.out.println("phone no entered");
		
		driver.findElement(By.xpath(OR.getProperty("SubmitBtn_XPATH"))).click();
		System.out.println("submit button clicked");
		

		if(driver.findElement(By.xpath("//body/npvn-alert[1]"))!= null){
			System.out.println("Success message is present");
		}else{
			System.out.println("Sucess message was absent");}
		

	}



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}




}


