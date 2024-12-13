package com.tka.sep_26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.tka.sep_25.LoginPageOfflineSite;

public class AddUserPageSelect {

	public static void main(String[] args) {
		WebDriver driver = LoginPageOfflineSite.getLogIn();

		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		System.out.println("Users Page------");

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		System.out.println("<< AddUser Page----" + driver.getTitle());

		driver.findElement(By.id("username")).sendKeys("Shruti");
		driver.findElement(By.id("mobile")).sendKeys("8411025472");
		driver.findElement(By.id("email")).sendKeys("Shuti@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Selenium");

		driver.findElement(By.id("Male")).click();

		WebElement stateElement = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		
		
		Select  selctstate=new Select(stateElement);
	//	List <WebElement> optionState=selctstate.getOptions();
		
		
	//	System.out.println("State Name List :-");
	//	for (WebElement stateName : optionState) {
	//		System.out.println(stateName.getText());
			

	//	WebElement westate=optionState.get(3);
	//	String mystate= westate.getText();
	//	stateElement.sendKeys( mystate);
		
		
		selctstate.selectByIndex(2);
		System.out.println("Select State Name ");
		
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")).click();
		
		Alert  alrt = driver.switchTo().alert();
		System.out.println("alert MSG >" + alrt.getText());
		alrt.accept();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click();
		
	}
}

