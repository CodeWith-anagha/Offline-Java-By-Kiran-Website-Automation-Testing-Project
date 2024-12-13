package com.tka.sep_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPageAutomateLink {

	
	public static void main(String[] args) {
		
		WebDriver driver=LoginPageOfflineSite.getLogIn();
		System.out.println("Now Dashboard page testing");
		
		
		WebElement linkElement=driver.findElement(By.xpath("/html/body/div/footer/strong/a"));
		//text--getText
		
		
		//get value of attribute
		
		String attributeValue=linkElement.getAttribute("target");
		System.out.println("href value >" +attributeValue);
		
	}
}
