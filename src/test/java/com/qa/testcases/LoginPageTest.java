package com.qa.testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;


public class LoginPageTest extends TestBase {


	public LoginPageTest() {
		super();
	}




	@BeforeMethod
	public void setUp(){
		initialization();

	}


	@Test (priority = 1)
	public void ValidSigninTest() {

		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("AdminEmail_TXT"));
		System.out.println("Admin email passed into text box");		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password_TXT"));
		System.out.println("Admin password passed into text box");

		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Signin button clicked");

		if(driver.findElement(By.xpath("//body/npvn-alert[1]"))!= null){
			System.out.println("Success message is present");
		}else{
			System.out.println("Sucess message was absent");}


		String actual_msg=driver.findElement(By.xpath("//a[contains(text(),'Forms')]")).getText();
		String expect="Forms";
		Assert.assertEquals(actual_msg, expect);
		System.out.println("Admin was able to signin sucessfully");


	}

	@Test (priority = 2)
	public void InvalidSigninTest() throws InterruptedException {

		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("AdminEmail0_TXT"));
		System.out.println("Admin email passed into text box");		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password0_TXT"));
		System.out.println("Admin password passed into text box");

		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Summit button clicked");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//body/npvn-alert[1]"))!= null){
			System.out.println("Error message is present");
		}else{
			System.out.println("Error message is absent");}

	
		String actual_msg=driver.findElement(By.xpath("//a[contains(text(),'Register')]]")).getText();
		String expect="Sign in";
		Assert.assertEquals(actual_msg, expect);
		System.out.println("Admin was unable to Sign in");
		
		Thread.sleep(5000);

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}




}






