
package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;


public class FormPageTest extends TestBase {


	public FormPageTest() {
		super();
	}




	@BeforeClass
	public void setUp(){
		initialization();

	}



	@Test  (priority=1)
	public void AddFormTest() throws InterruptedException {
		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("AdminEmail_TXT"));
		System.out.println("Admin email passed into text box");		
		driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password_TXT"));
		System.out.println("Admin password passed into text box");

		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Signin button clicked");
		
		driver.findElement(By.xpath(OR.getProperty("SigninBtn_XPATH"))).click();
		System.out.println("Signin button clicked");
		
		driver.findElement(By.xpath("//body/div[3]/nav[1]/div[1]/div[1]/div[1]/button[1]")).click();
		System.out.println("Add new button clicked");
		
		driver.findElement(By.xpath("//body/div[3]/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		System.out.println("Form clicked");
		
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(OR.getProperty("Covid190"));
		System.out.println("Name of form entered");
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(OR.getProperty("Covid190"));
		System.out.println("Name of form entered");
		
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		System.out.println("save button clicked");

	}
		
	
	@Test  (priority=2)
	public void DispatchFormTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//body/div[3]/nav[1]/div[1]/div[1]/div[1]/button[1]")).click();
		System.out.println("Add new button clicked");
		
		driver.findElement(By.xpath("//body/div[3]/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		System.out.println("Dispatch clicked");
		
		
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		System.out.println("Start new dispatch clicked");
		
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
		System.out.println("Add receipient clicked");
		
		
		driver.findElement(By.xpath("//small[contains(text(),'fadartflair@gmail.com')]")).click();
		System.out.println(" receipient Selected");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		System.out.println(" next button Selected");
		
		
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("New batch");;
		System.out.println("batch name enterd");
		
		
		driver.findElement(By.xpath("//small[contains(text(),'fadartflair@gmail.com')]")).click();
		System.out.println(" receipient Selected");
		
		
		
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect5']")).click();
		System.out.println(" form Selected");
		
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect5']")).click();
		System.out.println(" Due date clicked");
		
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect5']")).click();
		System.out.println(" Due date field clicked");
		
	
		driver.findElement(By.xpath("//input[@id='exampleInputEmail4']")).click();
		System.out.println(" Due date clicked");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		System.out.println(" next button Selected");
		
		System.out.println(" Form dispatched");
		
	}
	
	
	
	
	
	@Test  (priority=4)
	public void deleteFormTest() throws InterruptedException {
		
		

	}
	
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}


